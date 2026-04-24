Règles du jeu
- Un nombre aléatoire est généré entre **1 et 100**
- L’utilisateur dispose de **10 essais**
- Après chaque tentative :
  - Le programme indique si le nombre est supérieur ou inférieur
- Si l’utilisateur trouve le bon nombre :
  - Le jeu s’arrête
  - Un message de victoire est affiché
- Si les 10 essais sont utilisés sans succès :
  - Le jeu s’arrête
  - Un message de défaite est affiché

Structure du projet
- `Main.java` : contient la méthode `main` et toute la logique du jeu

Fonctionnement du programme
2. Lecture de l’entrée utilisateur avec la classe `Scanner`
3. Utilisation d’une boucle `while` pour limiter les essais à 10
4. Comparaison entre le nombre entré et le nombre aléatoire
5. Affichage de messages pour guider l’utilisateur
6. Fin du jeu en cas de victoire ou de défaite
