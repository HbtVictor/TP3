Projet Java avec les 3 patterns demandés (State / Strategy / Visitor) dans des packages séparés.



# Lancer chaque pattern
java -cp out StatePattern.Main
java -cp out StrategyPattern.Main
java -cp out VisitorPattern.document.Main

Ou dans votre IDE : exécutez simplement les 3 classes Main.java.

Ce que font les démos
State → transitions du lecteur audio avec messages clairs
Strategy → changement de mode livraison (Standard → Express → International) sur la même commande
Visitor → génération d’un mini-PDF + comptage de mots sans toucher aux classes Text/Image/Table