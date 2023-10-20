Il y a toujours plusieurs bonnes solutions !!!! $\Rightarrow$ frictions sur les solutions à adopter....

## Principes du software engineering

- Conway's law: l'architecture va être influencée par la structure de l'organisation.
  La nature des choses fait que les gens organisent l'architecture en fonction de comment ils travaillent
  
- S.O.L.I.D: notion de single responsability: 1 composant a 1 et 1 seule responsabilité.
  Possibilité d'étendre le comportement en empêchant les autres de modifier ce comportement
  Substitution de Liskov:
  On dépend d'interfaces et pas de classes concrêtes...

- YAGNI: You aren't gonna need it: Ne pas implémenter ce dont on n'a pas besoin -> contradiction avec S.O.L.I.D

- KISS: Keep It Stupid Simple: -> contradiction S.O.L.I.D

- Demeter: ne pas parler aux étrangers (ne pas avoir des packets/interfaces venant de partout), doit garder privé la connaissance de l'implémentation

Ensuite:

Documenter les 5 vues
- scenarios
- logical
- process
- development
- physical: server etc...

### Architecture
- Pas donner trop de détails... Sinon, la doc va vite être obsolète...
- pas d'importance de la forme, mais garder toujours la même forme... Garder la cohérence

Diagramme de classe !!!!!! À revoir !!!!!!!

composition: B est détruit si A est détrouit
aggrégation: B n'est pas détruit si A est détruit (p50)




Tout part des non-functionnal requirements

Trouver les questions d'examens

p54 à apprendre par coeur !!!!

Architecture en couches (ex: network) -> la couche 1 ne peut que parler à la couche 2 etc... Le code de la couche 1 est complètement indépendant de la couche 4. Impact négatif sur les perfs.
Permet de réduire le couplage et d'augmenter la cohésion...

Pipe and filter (ex: bash) -> séquence d'opérations ou de transformations... Les filtres ne doivent pas avoir d'états. Peut avoir impact négatif sur la disponibilité et la consistance...
Tout échoue si un des tuyaux a un trou !!! Il faut recommencer du début dans ces conditions !!! On ne peut pas recommencer au début du filtre.
réduit couplage, manage ressources (travail en parallèle), augmente cohérence

Broker: On passe par un intermédiaire qui met le client et le serveur en communication... Broker nous envoie vers le bon service...
march align (sérialisation) et unmarchalign(désérialisation): passer ce qui est en mémoire sur le disque ou sur le réseau... problème: coûte du temps
Introduit un état entre le client et le serveur: problème d'un état: (state full) Quand ça pète, il faut pouvoir reprendre les choses en main...
Il faut un contrat entre le client, le broker et le service...
Impact négatif sur performances
Chaque communication doit être encodée
Tout passe par le broker -> si celui-ci fait coin coin, tout le monde va faire coin coin...
Super implémentation de la loi de Demeter
On contrôle la demande, augmente les perfs