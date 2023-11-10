# API Rest

concept d'API qu'on met sur le web...

Les micro-services sont sur le réseau et communiquent entre eux par HTTP.

API Rest -> communication entre les différents micro-services...
Il y a une dépendance entre les différents micro-services

Blue green: on passe un micro-service de v1 à v2

canari deployement: on passe 1 ou 2 services en v2 et on regarde ce qui se passe... Si tout se passe bien, on peut faire le rolling update....

## Proxy and virtual proxy

L'idée c'est de dire qu'on a quelqu'un qui va offrir le même service qu'on avait au départ, mais avec un petit service en plus...

Objet très lourd à créer...
Pour des raisons de facilité, on a besoin tout le temps d'une instance de notre objet.
On ne veut pas se taper le constructeur très lourd tout le temps.
On retarde la création de l'objet très lourd grâce au lazy proxy.


Exemple: get student database... on veut voir une fois de temps en temps la photo du student -> on va créer un proxy pour éviter de charger à chaque fois la photo quand on ne la veut pas...

On peut rajouter des vérifications de sécurité ou de mesure de performance ou des services sur un service...

Proxy très proche de l'adapteur, mais l'adapteur est sur les objets et les proxys sont sur les micro-services

Code client découplé de l'implémentation...

Très utilisé de façon cachée.

@blabla -> lié avec les proxys...

proxy demande override mais override n'est pas un proxy

## Decorator

Permet d'augmenter le comportement de quelque chose sans toucher la classe originale... Permet d'augmenter les structures...

On a un composant qu'on veut décorer...

Il n'est pas compliqué....

## Template method

c'est comme une recette de cuisine

C'est un algorithme et on veut réutiliser une partie de l'algorithme

On a un algorithme avec un certain nombre de méthodes privées et de méthodes abstraites...

## Flyweight

Il s'agit d'un patern qui permet de créer des structures de graphe plus légère en factorisant des branches de graphe....

On va calculer à chaque noeud de l'arbre, on donne un hash pour identifier si la structure existe déjà...

Gain mémoire
