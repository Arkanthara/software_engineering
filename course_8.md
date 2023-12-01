# Qualité

- Tests fonctionnels / non fonctionnels
    - fonctionnels
        - validité: tests à partir des user requirements (client)
        - vérification: tests à partir des spécifications (programmeur)
    - non fonctionnels
        - nombre de clics pour atteindre son objectif

- Pair review (revue de code par les autres) (Améillore la qualité du code et de l'équipe)

(coder = prendre des décisions... Transformer l'informel en formel)

# Utilité

- Nombre de clics


# Principes du test

- Les tests sont les preuves des bugs...
- Tester tous les cas de figure n'est pas possible...
- Tester les sections critiques du code
- Chaos testing
- Se mettre à la place de l'utilisateur


-> on crée des classes d'équivalences !!! ex: test sur des nombres -> on divise en nombre positif, nombre négatif, et 0...
    -> soucis: supposition que le code est homogène...

-> créer les classes d'équivalence et les noter pour les expliciter...

tests driven developpement: écrire les tests avant de commencer à coder...
->>>> il faut écrire les tests pendant le code...


Toujours regarder la densité des composantes: Région dense -> plus grande probabilité de trouver un bug...

!!! Tests vieillissent super mal.... -> écrire des tests facile à maintenir...

On ne fait pas les mêmes tests pour un avion plutôt que pour les photos de la grand mère...


Respecter la spécification ne veut pas dire que le client sera content...



# Niveaux de tests

- Component testing: on teste au niveau le plus bas
- Integration testing: on prend plusieurs classes et on fait des tests
- System testing
- User testing


!!!! Connaître par coeur la pyramide des tests !!!!

Static testing: tests avant la compilation -> utilisation d'outils pour analyser le code...
Unit testing: test unitaire reste restrein dans ce que cela teste... (run localement)
Integration testing: (run un peu comme dans la production...) Si notre code a une dépendance sur quelque chose d'autre, on va mettre un moc simulant le comportement du composant manquant...

white box: peut regarder à l'intérieur vs black box...

validation
API
GUI
System testing (manuel)
Acceptance (manuel) (fait par le client)


On fait les tests en isolation... on utilise des mock

tests d'intégrations: tests sur des ensembles de composants, ...

Tests types

functional
structure / architecture
non-functional
change-related

Tests techniques

White box -> permet de savoir ce qu'il se passe en lisant le code...
Black box -> ???

Tests techniques

- static
    - review / audit: Besoin de personnes expérimentées
    - static analysis: permet de trouver des bugs cachés etc...
    - automatic inspection of the code
    - no execution / symbolic execution (on va simuler l'exécution du code... On va simuler ce que le code fait... On fait une exécution symbolique...)
-dynamic
    - white box: on écrit les tests en connaissant les spécifications
    - black box: on écrit des tests en connaissant les requirements
    - code coverage (au moment de l'exécution, on va enregistrer tout les endroits par où on est passé....) Donne uniquement l'information si on est passé ou pas par là...
        Ne garantit pas que l'assertion obtenue est correcte...


Test:
- software under test (SUT)
- c'est un gros automate (on a un ensemble d'inputs qui va faire avancer l'automate...
- on utilise un oracle pour savoir si les tests passent...

Un même résultat en fonction du test peut être correct ou incorrect...

anatomie d'un test
- setup
- 

tests doubles (C'est comme les doublures au cinéma)

!! Il faut toujours se placer au niveau du composant qui est mis sous test !!

Création de mocks pour si un composant mis sous tests a besoin d'autre composants pour tourner

mock dummy: mock pour que cela compile...
mock fake (on écrit simplement la chose la plus simple pour que les tests passent
mock stub: ???

Les vrai mock
On peut créer des assertions sur les messages échangés entre les 2 composantes

Spy: software tourne déjà... spy va enregistrer toutes les communications entre les 2 composantes...

Ne nous dit pas que ce qu'il a généré comme tests est correct...
Cela risque de trop figer les tests sur une version donnée... Permet de faire un test de non régression sur une version donnée... On ne maintient pas le spy, mais on intègre les résultats du spy dans nos tests unitaires... Il faut prendre ce que le spy nous donne
