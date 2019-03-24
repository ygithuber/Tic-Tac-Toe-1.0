/*
 	Les positions sur la grille sont index�es de la fa�on suivante :
	
	0	1	2
	3	4	5
	6	7	8
 */

public interface TTT {

   /* pour initialiser un jeu de tic tac toe */
   public void init();
   
   /* pour recevoir l'index de la cellule choisie par X */
   public void setChoixX( int cellule);
   
   /* Pour transmettre l'index de la position du O jou� */ 
   public int getChoixO();
    	
   /* vrai ou faux, le joueur pass� en param�tre ("X" ou "O")
    * a gagn�?  Si vrai, les index des 3 cellules de la combinaison
    * gagnante sont dans le tableau pos.
    *
    *  Il y a 8 combinaisons gagnantes :
     * (0, 1, 2), ( 0, 4, 8) et (0, 3, 6)
     * (6, 7, 8) et (6, 4, 2)
     * (3, 4, 5)
     * (1, 4, 7)
     * (2, 5, 8)
    *
    */ 
   public boolean gagne(String joueur, int[] pos );
   
   /*Toutes les cellules sont occup�es et il n'y a aucun gagnant */
   public boolean isNulle();   
}