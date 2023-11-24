# Observer

On utilise une structure de base pour java... On va avoir 2 constructions: un subscriber et un publisher

Il faut dire ce que l'on veut publier
Il faut dire à qui l'on veut publier

Souvent factory et singleton sont utilisés ensemble


# Visitor

Visiteur: objet se balladant dans le graphe qui va suivre les méthodes accept 

Augmente la cohésion et diminue le couplage.

Visitor crée quelque chose à còté : différent du décorateur qui modifie directement le comportement de la structure

(Utilisé pour faire de la transformation de graphe)

On doit composer les différents design pattern entre eux...


# Qualité d'un logiciel

- qualité externe:
    - qualité fonctionnelle... (Dépend de beaucoup de choses... )
    - qualité non-fonctionnelle (nombre de clics limité pour arriver à l'action finale, et un temps minimal passé dessus)
        réutilisabilité
        portabilité
        interopérabilité
        robustness

- qualité interne: qualité tel que nous nous la voyons de notre côté...
    - validité par rapport à la spécification (requirement vient de l'utilisateur... Spécification: modélisation des requirements)
    - maintenabilité

Comment améillorer la qualité ?

- tests: (regarder si les résultats sont cohérent)

(Attention ! le programmeur ne connait que la vue (la spécification) du client... Les tests doivent être fait par le client...???)
- relecture de code: on voit notre code d'une certaine façon quand on programme...

(On code et après on fait la pull request, qu'on va revoir avec d'autres programmeurs)
- utiliser les design patterns...

Au début, on a un humain qui a fait une erreur... Cela peut conduire à un comportement déviant du comportement attendu... Cela n'entraine pas nécessairement la failure....

On travaille toujours sur les 3 niveaux....

# V&V (Très important)
Validation: est-ce qu'on a fait le bon logiciel pour l'utilisateur ? (Fait par rapport aux besoins de l'utilisateurs...)
Verification: est-ce qu'on a codé cela proprement ? (Par rapport aux spécifications...)

Les 2 sont importants !!!!

De base, on commence avec des besoins utilisateurs, desquels on va en retirer des spécifications (Donne une idée des requirements....)
Cependant, le code est formel... Quand on code, on ajoute une sémantique beaucoup plus stricte...

On a les tests case qui vont vérifier les tests objectifs....

Un objectif de test est ce que l'on veut tester...

test plan: écrire le scope, l'approche, les ressources

Attention ! le nombre d'états que peut atteindre un logiciel actuellement est monstrueux... -> On ne peut pas tout tester... 


Qu'est-ce que c'est le testing

- évaluer le critère de sortie
- ne pas s'imaginer que quand on n'a plus de bugs, on n'en a effectivement plus...
- Comment on reporte les déviations ? (Peuvent bloquer les tests, ou bloquer la release...)

Au niveau architecture, il faut que tester ne sois pas trop compliquer -> bonne architecture... -> architecture de test présente dès le début ....

Faire en sorte qu'on ait une traçabilité bidirectionnelle des tests -> quand ça ne marche pas, il faut pouvoir reproduire ce qui n'a pas marché

Comparer les résultats reçus et les résultats expected... Quand il y a un bug, les specs peuvent l'être, ou alors les tests, ou le programmeur a mal programmé ou ... De temps en temps, il faut garder le bug comme il est car les clients se sont habitués au bug... Il faut par contre le mettre en known issue....


Important: on collectionne les données des exécutions et à la fin, on prend une décision... La décision ne dépend pas du développeur...

On regarde comment on peut améillorer la structure, clean le code etc....


Combien de tests sont importants ? Cela dépend...
