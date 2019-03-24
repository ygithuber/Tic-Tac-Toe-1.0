# Tic-Tac-Toe-1.0
Jeu de Tic Tac Toe

Le fichier TTT.java contient une interface graphique. 

Le fichier Grille.java contient le code java, utilisant Swing et AWT, pour interagir avec le joueur « X ». Elle représente une grille de Tic Tac Toe sur laquelle on peut cliquer pour choisir la position du prochain X.

Le fichier Jeu.java contient une classe Jeu qui implémente l’interface graphique contenue dans la classe TTT du fichier TTT.java, elle contient les fonctions suivantes :


 init : Méthode pour (ré)initialiser le jeu avant de débuter une nouvelle partie.
isNulle : Méthode qui va déterminer si toutes les positions de la grille sont occupées sans qu’il y ait de gagnant. Retourne true ou false. 
setChoixX : Méthode qui sera appelée par l’interface graphique pour communiquer la position choisie par le joueur « X ». Cette méthode reçoit paramètre l’entier correspondant à l’index de la position sur la grille. 
gagne : Méthode qui va recevoir la chaîne de caractères représentant le joueur, soit « X » ou « O ». La méthode va retourner true si une ligne, une colonne ou une diagonale est entièrement occupée par ce joueur. Dans ce cas, un tableau d’entier va contenir les 3 index de la ligne, colonne ou diagonale gagnante. Cette méthode va retourner false si le joueur n’a pas (encore) gagné.
getChoixO : Méthode qui doit déterminer le prochain coup de « O » et qui retourne l’index de la position choisie
