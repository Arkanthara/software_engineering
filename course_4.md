
L'implémentation, c'est la sémantique, le contract (API), c'est la syntaxe.

# REST APIs

Qu'est ce que c'est ?
C'est un endpoint, on lui dit fait ça, et il nous renvoie une réponse (on a ici déjà défini un contract...)
Ne renvoie pas d'éléments d'interface utilisateur
state less: ne renvoie pas d'état... L'effet qu'on va avoir dépend uniquement des paramètres qu'on a en entrée (Tout ce qui n'est pas scalable coûte cher!!! Tout ce qui est statefull n'est pas scalable...)
CDN: cache positionné géographiquement

On a toujours un verbe dans un appel rest (put, get, post, ...)
Les ressources sont toujours composées de métadonnées
(Pour aller plus vite, on échange une donnée juste tout le temps contre une donnée pas toujours à jour, mais disponible plus rapidement...)
prénom n'est pas une ressource
200 tout va bien. 201 ressource bien créée........ ???
300 j'ai bougé un truc
400 il y a une erreur. Requête mal formée... 401 on n'est pas connu... 403 on n'a pas le droit... 404 ressource inexistante...
500 erreur du serveur

Utiliser des paginations pour éviter d'avoir trop d'éléments dans les grandes bases de donnée
march align (c'est comme créer un paquet à partir d'une donnée) unmarch align (c'est comme dépaqueter le packet reçu)

# Design patterns

Des personnes avant moi se sont prise un mur. Elles ont documenté le problème, comme cela, je peux éviter de me prendre le mur.

## Singleton
static: variable partagée entre toutes les instances d'une même classe
synchronized: qu'un seul thread ne peut accéder en même temps
volatile: on force à la stocker dans un registre, donc elle ne parait jamais en cache...
## Abstract factory
abstract factory: dissocier l'utilisation d'un objet de sa création (augmente la cohésion et diminue le couplage (sépare les choses))
dans le client, pas besoin de savoir comment c'est implémenté (diminue couplage)
pas besoin d'avoir un import d'un objet spécifique (on ne dépend que d'interfaces et pas de classes) (augmente cohésion)

interface vs classe abstraite:
java: pas faire un extend de plus qu'une classe...

## Prototype
Plutôt que de créer une structure complexe, je vais faire une copie mémoire de cette structure complexe et je modifie ce que j'ai à modifier.
On a un prototype et on copie le prototype
shadow copy vs deepcopy

## Adapter or Wrapper
pas faire de instanceof, mais un wrapper
On prend l'objet, et on l'enveloppe dans une nouvelle interface...
But: adapter 2 contrats qui ne sont pas les mêmes... Utile pour si on importe une librairie
