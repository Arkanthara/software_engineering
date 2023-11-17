

## Abstract factory

L'idée est de séparer la création d'un objet de son utilisation...

On ne connait pas l'implémentation de l'objet qu'on utilise...

On crée un objet et renvoie une interface pour le client

On a 2 niveaux dpabstractions: 

Premier gain: réduire le couplage (on déplace la responsabilité...)

Séparation de la création de l'objet avec son utilisation

On crée un service et d'autres vont créer un autre service qui qui a besoin de notre service... Ils implémentent alors un pseudo-service avec l'abstract factory. Puis lorsque notre implémentation est bonne, ils la prennent et l'utilisent... (C'est pas hyper clair...)

# Flyweight

On découvre un pattern, on l'extraye, et on le rend unique... (hashCode et equals...)

WeakHashMap<>(): Permet de garbage collecter

## Command

L'interface ne connait pas la classe et vice versa...

On peut regarder chacune des parties sans se concentrer sur le reste.

Functionnal interface en java possède une fonction void execute() !!!

Il y a une méthode d'arité 1 et cela ne marche qu'avec les méthodes d'arité 1...

## Builder

Sépare la création de la structure de graphe d'avec la structure d'un noeud...

Le builder va créer un object avec toutes les propriétés données vs décorateur: ajoute des propriétés sur un objet...

## Facade

On a beaucoup de services différents et c'est difficile de savoir comment les utiliser...

On va créer une nouvelle interface permettant d'orchestrer les différents services...

## Observer

Architecture pattern publish subscribe... Observer est une implémentation de cela...

On va avoir un sujet, un observeur qui observe les changements dans le sujet

## State

!!!! Pas de instance of !!!!!!!!


## Visitor


