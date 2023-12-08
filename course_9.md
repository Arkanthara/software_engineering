Qu'est ce que cela veut dire de tester en blackbox

200 -> succès 201 ressource créée


Toujours commencer par faire un contrat....

API c'est un contrat.... Il y a une api bonne ou mauvaise quand on a une interface... (Peut être une interface rest...)

classes d'équivalences: permet de ne pas avoir tous les cas à traiter


# Productivité

si on fait tout le temps la même chose, c'est pas bien...
Si on a du travail manuel, il y a un problème...
Ne jamais se faire confiance... Il faut tout tester... Les tests unitaires ne sont pas inutiles...
Utiliser les bons outils !!!!
Il faut être les plus fainéants possibles... Utiliser des choses déjà existantes
Mesurer notre productivité... Mesurer ce qu'on est capable de livrer dans un temps donné...

Métrique ??????

Story point: façon de mesurer une quantité de travail pour une équipe donnée...

essayer de décoreller la notion de jour/personne avec la notion de story point

Les story point d'une équipe ne sont pas les même pour une autre équipe...

La vélocité de chaque équipe varie...

Burndown chart: on a tant de story point à accomplir en un certain temps... On visualise les story points en fonction du temps...

committed
completed
predictability
velocity: nb story point
throughput


Le développement logiciel n'est pas quelque chose de carré et prédictif à haut niveau... -> on ne sait jamais ce dans quoi on met les pieds... On n'est jamais sûr d'arriver à créer le logiciel...

On voit toujours les choses de façon très positive... Dans le cas du best case scenario, on est 30% optimist
Le pire des cas est rarement atteignable...


1 -> 5000 - 6000
2 -> 35 - 67
3 -> 300000 - 500000km³
4 -> 320
5 -> 1000 Milliar
6 -> 100 km³
7 -> 10 Milliar
8 -> 10000 km
9 -> 1 Milliar
10 -> 45 tonnes


-> quand on ne sais pas, on ne sais pas... Sinon, donner un range énorme pour mettre la balle dans le camp de l'autre personne...


Cone d'incertitude...

features -> tshirt size -> on coupe features en epics, qui vont valoir des story points (sp)

scientific wild-ass guess (SWAG)
anticipated requirements discovery (ARD)
permet de donner le degré de confiance qu'on a...
On découpe le requirements en plus petits bouts -> permet de tra

Ne pas dire qu'on ne veut pas estimer !!!! Il vaut mieux mettre une énorme estimation que pas d'estimation du tout...

software factory

- IDEs
- Build tool
- Git (stocker son code) commit et push régulièrement
- 
- docker + kubernetes -> exécuter application dans des containers (c'est un peu comme des VMs...)
- sonatype (.jar, .exe etc...) stocker tous ce que l'on produit sur un artefact management system... Ex: .jar, .exe, etc... avec un artefact management (file server avec traçabilité et signature de l'artéfact)
