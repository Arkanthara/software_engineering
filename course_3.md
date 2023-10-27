Si on a plus que 10 classes, c'est pas très bon pour un domain model...

# Publish subscribe

Ex: annonce sur moodle que le cours est annulé...
Tout ceux qui sont inscrit sont mis au courrant: pas tout le monde reçoit le message, mais le professeur n'est pas obligé d'envoyer le message à chacun en particulier...

Ne pas utiliser cela pour la beauté du geste car il va falloir le maintenir...
Se méfier s'il y a de la sécurité concerné, car on pourrait retourner à une relation quadratique
Gérer les subscriptions peut devenir 'messy'

On est sûr que les messages sont délivrés (le paquet arrivera devant la porte, mais on n'a pas la garantie que le paquet va être ouvert...)

L'ordre des messages n'est pas garanti
Il peut arriver qu'un message soit répété...
Les messages ont une expiration.

Réduction du couplage: pas besoin de la relation de 1 à n: on ne connaît pas les subscribers
Augmente la cohésion: pas trop d'informations
Diffère le binding: le publisher n'a pas besoin de connaître le subscriber
Contrôle la demane: n au lieu de n^2 messages
Manage ressources

# Model view controller (MVC)

Avant, on avait un peu tout au même endroit... Casse la notion de décomposabilité... Très mauvaise cohésion
$\Rightarrow$ Diviser cela en 3 parties
- Domaine: data de l'application
- Vue: ce que l'utilisateur va voir
- Controller: coordonne la vue et le modèle

Soucis: modifications en cascade...
Réduit couplage
augmente la cohésion: chacun fait des choses spécifiques
diffère le binding: on peut crééer le modèle sans avoir la vue et vice versa

# Micro-services

C'est une marco architecture: regroupe beaucoup de paterns ensemble
Il est en réaction au monolite (tout ensemble)
Pour le mettre à jour, il faut stoper le monolite changer le monolite et tout redémarrer

Remplacer par des petits services...
Donne plus de flexibilités, mais demande plus d'expertise
S'adapte à beaucoup de cas de figure, et est pas trop sensible au changement (on peut mettre petit à petit à jour le modèle)

Mais demande beaucoup de technologies et beaucoup de paterns -> pour discuter entre eux, on a un soucis qui est quadratique...
Quelque fois, le monolyte est bien...

Quand on a beaucoup de services, le test est plus compliqué, cela consomme plus de mémoire et de cpu (footprint de base plus importante)
Problème de verbosité pour les discussions (tout passe par le réseau pour la communication inter-service)
Coût en termes de performances, souvent comblé grâce au grand nombre d'instances, mais il reste toujours un coût supplémentaire de base.
Bon micro-service: fait un service et seulement cela
Réduit le couplage
diffère le binding: ne sais pas comment appeler les autres micro-services
contrôle la demande: on ne peut pas parler à n'importe qui...
Tous les services peuvent potentiellement parler à tous les autres services (donc windows pas micro-services... En fait, c'est un gros monolite...)
En soit, chacun des micro-services est isolé...


# CQRS (Command query responsibility segregation)

Base de donnée: 3FN -> permet d'écrire vite, mais pas de lire vite, car on est obligé de faire des join.

Ex: reporting reglementing pour les banques -> énormes quantités de transactions -> grosses query avec beaucoup de join -> mais transaction doivent être stockées
le plus rapidement possible -> faire des pré-calculs pour avoir des query beaucoup plus performantes...

Ex: recherche en biologie -> grosses données -> read store et write store

On a une couche qui valide
on a des commandes

On va rendre à la fin le système consistant, mais on ne peut pas dire quand ce sera consistant... Il ne faut pas que ce soit consistant en tout point.
Transaction acid
- atomique
- consistante
- isolée
- durable

Notion de transaction acid est très importante... Ici, on abandonne la consistante, mais on sait que à un moment donné, notre système sera consistant.

On va souvent utiliser un publish subscribe
C'est assez compliqué
SI c'est mal implémenté, la consistance deviendra éventuelle...
Réduit le couplage: on a bien la partie consistance découplée de la partie quering
Modèle de lecture cohérent car spécifié pour la lecture
On contrôle la demande
manage ressource: on peut répartir les ressources comme on veut (ex: 200 cpu sur write store, et seulement 2 sur read store...)


# Event sourcing

Façon d'implémenter CQRS, mais avec un bus à la place du write store.... On ne stocke que les transactions... C'est extrêmement performant car on ne stocke que des données unitaires...
Les événements sont dans un read store
On a enlevé le write store... On ne stocke plus que des événements dans un bus (publish subscribe). C'est une queue d'événements...
Si plus de bus, on pert la cohérence et la consistance...
En réalité, on va associer les 2: on va mettre le write store et le bus, comme cela si le bus fail, on pourra toujours avoir le write store (qui est un subscriber),
on met des checkpoints et on regarde les événements à partir de ces checkpoints

Utilisation de beaucoup de technologies
utiliser cela avec cqrs
Plus il y a de pièces, plus cela peut exploser dans tous les côtés
Pas toujours la meilleure solution (c'est souvent le cas du gros canon pour tuer un moustique...)
Il faut un cache pour garder les vues dans l'objet
Même si on pert le read store, avec le write store et le bus, on peut tout reconstruire... Il faut tout perdre pour avoir quelques soucis...

NFR -> TACTIQUES -> PATTERNS

# Domain model

Ne pas essayer de l'optimiser !!!!
Éviter d'optimiser avant d'en avoir besoin !!!!

Travail en groupe: organiser le travail -> définir une interface

# API application programming interface

Impossible de faire une bonne api du premier coup -> la garder compatible !!!

Toujours essayer de se mettre dans la tête de celui qui va utiliser l'api pour qu'elle soit simple à utiliser...

Quand on écrit des api, minimiser le couplage avec d'autres paquets (sinon, api pas cohérente et mauvais couplage) -> cela va être plus difficile à tester...
Ne pas se préoccuper de l'implémentation de l'api (mauvais: getstudentlist() bon: getstudent())
Ne pas utiliser de Singleton
Utiliser les runtime exceptions
Rester cohérent (tout faire en anglais, par exemple)
utiliser les énums et les paramètres optionnels...
PENSER À LA TESTABILITÉ !!!!! (ex: on a une méthode prenant un objet, plutôt qu'une implémentation...)
