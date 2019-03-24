/*************************
*	Nom: Jeu.java
*	Cours IFT1135
*	Auteur 1: Youcef Touat
*	Matricule : 1068827
*   Auteur 2 : Ouiza Afettouche
*   Code Permanent : AFEO26597805
**************************/

import java.util.*;

public class Jeu implements TTT{
	private int  setPosition;			//Position jouee par O
	int nbrCoups;   				    // Nombre de coups
	private Vector<Integer> lespositionsX;		//Vecteur pour sauvgarder les positions de X
	private Vector<Integer> lespositionsO;		//Vecteur pour sauvgarder les positions de O
	private Vector<Integer> TouteLesPositions;	//Vecteur pour fair le decompte des positions pour la fonction isNulle
	
	//Constructeur sans parametres de la classe
	public Jeu(){
	}
		
	//Methode pour voir si un Vecteur contiens une combinaison de trois entiers donnes
		public boolean contiensComb(int [] comb, Vector <Integer> vect){
				boolean trouver = false;
				if(vect.contains(comb[0]) && vect.contains(comb[1]) && vect.contains(comb[2]))
							trouver = true;
				return trouver;
	}
	//Methode pour voir si une position donne est occupee par X ou O
	public boolean occupee(int position){
				boolean occupee = false;
					if(lespositionsX.contains(position) || lespositionsO.contains(position))
						occupee = true;
				return occupee;
			}
	/* pour initialiser un jeu de tic tac toe */
	   public void init(){
		   nbrCoups = 0;							    //initialisation du nombre des coups a 0
		   lespositionsX = new Vector <Integer>();      //initialisation de vecteur lespositionsX (vide)
		   lespositionsO = new Vector<Integer>();       //initialisation de vecteur lespositionsO (vide)
		   TouteLesPositions =	new Vector<Integer>();  //vecteur vide
		   		   //Remplissage du vecteur TouteLesPositions par toutes le valeur de 0 a 8
				   TouteLesPositions.addElement(0);
				   TouteLesPositions.addElement(1);
				   TouteLesPositions.addElement(2);
				   TouteLesPositions.addElement(3);
				   TouteLesPositions.addElement(4);
				   TouteLesPositions.addElement(5);
				   TouteLesPositions.addElement(6);
				   TouteLesPositions.addElement(7);
				   TouteLesPositions.addElement(8);
	   }
	   /* pour recevoir l'index de la cellule choisie par X */
	   public void setChoixX( int cellule){
		   
		   //Ajouter la position cliquee au valeur de X
		   lespositionsX.addElement(cellule); 
		   //Supprimer la valeur de X du vecteur touteslespositions
		   TouteLesPositions.removeElement(cellule);
	   }
	   /* Pour transmettre l'index de la position du O joué */ 
	   public int getChoixO(){
		   //incrementation du nombre de coups
		  nbrCoups++;
		  //Premier coup
		   if(nbrCoups == 1){
			  	if(!lespositionsX.contains(4)){
			  		setPosition = 4;
			  	}
			  	else 
			  		setPosition = 0;
		   }
		   //Dexiemme coup
		   if(nbrCoups == 2){
			   //Le cas ou X occupe la position 4
				if(lespositionsX.contains(4)){
					if(lespositionsX.contains(3))
						setPosition = 5;
					if(lespositionsX.contains(1))
						setPosition = 7;
					if(lespositionsX.contains(2))
						setPosition = 6;
					if(lespositionsX.contains(5))
						setPosition = 3;
					if(lespositionsX.contains(8))
						setPosition = 2;
					if(lespositionsX.contains(7))
						setPosition = 1;
					if(lespositionsX.contains(2))
						setPosition = 6; 
					if(lespositionsX.contains(6))
						setPosition = 2; 
				}
				//Le cas ou O occupe la position 4
				if(lespositionsO.contains(4)){
					if(lespositionsX.contains(0) && lespositionsX.contains(8))
						setPosition = 1;
					else if(lespositionsX.contains(7) && lespositionsX.contains(8))
						setPosition = 6;
					else if(lespositionsX.contains(6) && lespositionsX.contains(7))
						setPosition = 8;
					else if(lespositionsX.contains(6) && lespositionsX.contains(8))
						setPosition = 7;
					else if(lespositionsX.contains(2) && lespositionsX.contains(5))
						setPosition = 8;
					else if(lespositionsX.contains(2) && lespositionsX.contains(8))
						setPosition = 5;
					else if(lespositionsX.contains(5) && lespositionsX.contains(8))
						setPosition = 2;
					else if(lespositionsX.contains(0) && lespositionsX.contains(1))
						setPosition = 2;
					else if(lespositionsX.contains(0) && lespositionsX.contains(2))
						setPosition = 1;
					else if(lespositionsX.contains(1) && lespositionsX.contains(2))
						setPosition = 0;
					else if(lespositionsX.contains(0) && lespositionsX.contains(3))
						setPosition = 6;
					else if(lespositionsX.contains(0) && lespositionsX.contains(6))
						setPosition = 3;
					else if(lespositionsX.contains(3) && lespositionsX.contains(6))
						setPosition = 0;
					else if(lespositionsX.contains(2) && lespositionsX.contains(6))
						setPosition = 5;
					else if(lespositionsX.contains(1) && lespositionsX.contains(7))
						setPosition = 2;
					else if(lespositionsX.contains(3) && lespositionsX.contains(5))
						setPosition = 2;
					else if(lespositionsX.contains(0) && lespositionsX.contains(7))
						setPosition = 6;
					else if(lespositionsX.contains(0) && lespositionsX.contains(5))
						setPosition = 2;
					else if(lespositionsX.contains(2) && lespositionsX.contains(7))
						setPosition = 8;
					else if(lespositionsX.contains(2) && lespositionsX.contains(3))
						setPosition = 0;
					else if(lespositionsX.contains(1) && lespositionsX.contains(8))
						setPosition = 2;
					else if(lespositionsX.contains(6) && lespositionsX.contains(6))
						setPosition = 0;
					else if(lespositionsX.contains(3) && lespositionsX.contains(8))
						setPosition = 6;
					else if(lespositionsX.contains(5) && lespositionsX.contains(6))
						setPosition = 8;
					else if(lespositionsX.contains(1) && lespositionsX.contains(3))
						setPosition = 0;
					else if(lespositionsX.contains(1) && lespositionsX.contains(5))
						setPosition = 2;
					else if(lespositionsX.contains(5) && lespositionsX.contains(7))
						setPosition = 8;
					else if(lespositionsX.contains(3) && lespositionsX.contains(7))
						setPosition = 6;
					}
			   }
		   //Troisieme coup
			 if(nbrCoups == 3){
				 //Les coups gagneants de O
				 if(lespositionsO.contains(0)&&lespositionsO.contains(1)&& !occupee(2))
						setPosition = 2;					   
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(2)&& !occupee(1))
						setPosition = 1;
				 else if(lespositionsO.contains(1)&&lespositionsO.contains(2)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(4)&&!occupee(5))
			 				setPosition = 5;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(5)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(5)&& !occupee(3))
					 			setPosition = 3;
				 else if(lespositionsO.contains(6)&&lespositionsO.contains(7)&& !occupee(8))
						setPosition = 8;
				 else if(lespositionsO.contains(6)&&lespositionsO.contains(8)&& !occupee(7))
						setPosition = 7;
				 else if(lespositionsO.contains(7)&&lespositionsO.contains(8)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(6) && !occupee(3))
					 			setPosition = 3;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(3)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(6)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsO.contains(1)&&lespositionsO.contains(4) &&!occupee(7))
					 				setPosition = 7;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(7)&& !occupee(1))
					 				setPosition = 1;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(5)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(8)&& !occupee(5))
						setPosition = 5;
				 else if(lespositionsO.contains(5)&&lespositionsO.contains(8)&& !occupee(2))
						setPosition = 2;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(4)&&!occupee(8))
					 			setPosition = 8;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(8)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(8)&&!occupee(0))
					 			setPosition = 0;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(4)&&!occupee(6))
					 			setPosition = 6;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(6)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&& lespositionsO.contains(6)&&!occupee(2))
					 			setPosition = 2;
				 
				 //Les coups qui bloquent X
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(1)&& !occupee(2))
						setPosition = 2;					   
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(2)&& !occupee(1))
						setPosition = 1;
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(2)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(4)&&!occupee(5))
					 			setPosition = 5;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(5)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(5)&&!occupee(3))
					 			setPosition = 3;
				 else if(lespositionsX.contains(6)&&lespositionsX.contains(7)&& !occupee(8))
						setPosition = 8;
				 else if(lespositionsX.contains(6)&&lespositionsX.contains(8)&& !occupee(7))
						setPosition = 7;
				 else if(lespositionsX.contains(7)&&lespositionsX.contains(8)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(6)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(3)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(6)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(4)&& !occupee(7))
					 setPosition = 7;	
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(7)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(7)&&!occupee(1))
					 	setPosition = 1;	
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(5)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(8)&& !occupee(5))
						setPosition = 5;
				 else if(lespositionsX.contains(5)&&lespositionsX.contains(8)&& !occupee(2))
						setPosition = 2;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(4)&&!occupee(8))
					 			setPosition = 8;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(8)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(8)&&!occupee(8))
					 			setPosition = 0;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(4)&&!occupee(6))
					 			setPosition = 6;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(6)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(6)&&!occupee(2))
				 			setPosition = 2;
				 
				//les coups de O si O occupe une position sur colonne, une ligne 
				 //ou un diagonale sans que X soit present sur cette colone, ligne ou diagonale 
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(1) || lespositionsO.contains(2)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(1)&& !lespositionsX.contains(2)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(1))
				   			setPosition = 1;
				   		else
				   			setPosition = 2;
				 else if(( lespositionsO.contains(3)|| lespositionsO.contains(4) || lespositionsO.contains(5)) 
				   			&& (!lespositionsX.contains(3) && !lespositionsX.contains(4)&& !lespositionsX.contains(5)))
				   		if(!occupee(3))
				   			setPosition = 3;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 5;
				 else if(( lespositionsO.contains(6)|| lespositionsO.contains(7) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(6) && !lespositionsX.contains(7)&& !lespositionsX.contains(8)))
				   		if(!occupee(6))
				   			setPosition = 6;
				   		else if (!occupee(7))
				   			setPosition = 7;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(3) || lespositionsO.contains(6)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(3)&& !lespositionsX.contains(6)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(3))
				   			setPosition = 3;
				   		else
				   			setPosition = 6;
				 else if(( lespositionsO.contains(1)|| lespositionsO.contains(4) || lespositionsO.contains(7)) 
				   			&& (!lespositionsX.contains(1) && !lespositionsX.contains(4)&& !lespositionsX.contains(7)))
				   		if(!occupee(1))
				   			setPosition = 1;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 7;
				 else if(( lespositionsO.contains(2)|| lespositionsO.contains(5) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(2) && !lespositionsX.contains(5)&& !lespositionsX.contains(8)))
				   		if(!occupee(2))
				   			setPosition = 2;
				   		else if (!occupee(5))
				   			setPosition = 5;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(4) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(4)&& !lespositionsX.contains(8)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(2)|| lespositionsO.contains(4) || lespositionsO.contains(6)) 
				   			&& (!lespositionsX.contains(2) && !lespositionsX.contains(4)&& !lespositionsX.contains(6)))
				   		if(!occupee(2))
				   			setPosition = 2;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 6;
				 else 
					 //jouer n'importe quel coups qui n'est pas occupee
					 for(int i = 0; i < 9; i++)
						 if(!occupee(i))
							 setPosition = i;
			}
			 // Quatrieme coup
			if(nbrCoups == 4){
				//Les coups gagneants de O pour la premiere positionsX = 4
				 if(lespositionsO.contains(0)&&lespositionsO.contains(1)&& !occupee(2))
						setPosition = 2;					   
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(2)&& !occupee(1))
						setPosition = 1;
				 else if(lespositionsO.contains(1)&&lespositionsO.contains(2)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(4)&&!occupee(5))
			 				setPosition = 5;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(5)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(5)&& !occupee(3))
					 			setPosition = 3;
				 else if(lespositionsO.contains(6)&&lespositionsO.contains(7)&& !occupee(8))
						setPosition = 8;
				 else if(lespositionsO.contains(6)&&lespositionsO.contains(8)&& !occupee(7))
						setPosition = 7;
				 else if(lespositionsO.contains(7)&&lespositionsO.contains(8)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(6) && !occupee(3))
					 			setPosition = 3;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(3)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsO.contains(3)&&lespositionsO.contains(6)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsO.contains(1)&&lespositionsO.contains(4) &&!occupee(7))
					 				setPosition = 7;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(7)&& !occupee(1))
					 				setPosition = 1;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(5)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(8)&& !occupee(5))
						setPosition = 5;
				 else if(lespositionsO.contains(5)&&lespositionsO.contains(8)&& !occupee(2))
						setPosition = 2;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(4)&&!occupee(8))
					 			setPosition = 8;
				 else if(lespositionsO.contains(0)&&lespositionsO.contains(8)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&&lespositionsO.contains(8)&&!occupee(0))
					 			setPosition = 0;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(4)&&!occupee(6))
					 			setPosition = 6;
				 else if(lespositionsO.contains(2)&&lespositionsO.contains(6)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsO.contains(4)&& lespositionsO.contains(6)&&!occupee(2))
					 			setPosition = 2;
				 //Les coups de O pour bloquer X
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(1)&& !occupee(2))
						setPosition = 2;					   
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(2)&& !occupee(1))
						setPosition = 1;
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(2)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(4)&&!occupee(5))
					 			setPosition = 5;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(5)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(5)&&!occupee(3))
					 			setPosition = 3;
				 else if(lespositionsX.contains(6)&&lespositionsX.contains(7)&& !occupee(8))
						setPosition = 8;
				 else if(lespositionsX.contains(6)&&lespositionsX.contains(8)&& !occupee(7))
						setPosition = 7;
				 else if(lespositionsX.contains(7)&&lespositionsX.contains(8)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(6)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(3)&& !occupee(6))
						setPosition = 6;
				 else if(lespositionsX.contains(3)&&lespositionsX.contains(6)&& !occupee(0))
						setPosition = 0;
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(4)&& !occupee(7))
					 setPosition = 7;	
				 else if(lespositionsX.contains(1)&&lespositionsX.contains(7)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(7)&&!occupee(1))
					 	setPosition = 1;	
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(5)&& !occupee(3))
						setPosition = 3;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(8)&& !occupee(5))
						setPosition = 5;
				 else if(lespositionsX.contains(5)&&lespositionsX.contains(8)&& !occupee(2))
						setPosition = 2;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(4)&&!occupee(8))
					 			setPosition = 8;
				 else if(lespositionsX.contains(0)&&lespositionsX.contains(8)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(8)&&!occupee(8))
					 			setPosition = 0;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(4)&&!occupee(6))
					 			setPosition = 6;
				 else if(lespositionsX.contains(2)&&lespositionsX.contains(6)&& !occupee(4))
						setPosition = 4;
				 else if(lespositionsX.contains(4)&&lespositionsX.contains(6)&&!occupee(2))
				 			setPosition = 2;
				 
				//les coups de O si O occupe une position sur colonne, une ligne 
				 //ou un diagonale sans que X soit present sur cette colone, ligne ou diagonale
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(1) || lespositionsO.contains(2)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(1)&& !lespositionsX.contains(2)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(1))
				   			setPosition = 1;
				   		else
				   			setPosition = 2;
				 else if(( lespositionsO.contains(3)|| lespositionsO.contains(4) || lespositionsO.contains(5)) 
				   			&& (!lespositionsX.contains(3) && !lespositionsX.contains(4)&& !lespositionsX.contains(5)))
				   		if(!occupee(3))
				   			setPosition = 3;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 5;
				 else if(( lespositionsO.contains(6)|| lespositionsO.contains(7) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(6) && !lespositionsX.contains(7)&& !lespositionsX.contains(8)))
				   		if(!occupee(6))
				   			setPosition = 6;
				   		else if (!occupee(7))
				   			setPosition = 7;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(3) || lespositionsO.contains(6)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(3)&& !lespositionsX.contains(6)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(3))
				   			setPosition = 3;
				   		else
				   			setPosition = 6;
				 else if(( lespositionsO.contains(1)|| lespositionsO.contains(4) || lespositionsO.contains(7)) 
				   			&& (!lespositionsX.contains(1) && !lespositionsX.contains(4)&& !lespositionsX.contains(7)))
				   		if(!occupee(1))
				   			setPosition = 1;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 7;
				 else if(( lespositionsO.contains(2)|| lespositionsO.contains(5) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(2) && !lespositionsX.contains(5)&& !lespositionsX.contains(8)))
				   		if(!occupee(2))
				   			setPosition = 2;
				   		else if (!occupee(5))
				   			setPosition = 5;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(0)|| lespositionsO.contains(4) || lespositionsO.contains(8)) 
				   			&& (!lespositionsX.contains(0) && !lespositionsX.contains(4)&& !lespositionsX.contains(8)))
				   		if(!occupee(0))
				   			setPosition = 0;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 8;
				 else if(( lespositionsO.contains(2)|| lespositionsO.contains(4) || lespositionsO.contains(6)) 
				   			&& (!lespositionsX.contains(2) && !lespositionsX.contains(4)&& !lespositionsX.contains(6)))
				   		if(!occupee(2))
				   			setPosition = 2;
				   		else if (!occupee(4))
				   			setPosition = 4;
				   		else
				   			setPosition = 6;
				 else 
					//jouer n'importe quel coups qui n,est pas occupee
					 for(int i = 0; i < 9; i++)
						 if(!occupee(i))
							 setPosition = i;
			}	
			//Supprimer la valeur de la position occupee par O
			TouteLesPositions.removeElement(setPosition);
			//Ajouter la valeur de la position occupee par O au positions de X
			lespositionsO.addElement(setPosition);
			   return setPosition;
	}
	 /*Tester si les positions de X ou de O presentent une position Gagneante*/  
 public boolean gagne(String joueur, int[] pos ){
	 
	 	int CombGagneante[][] = new int[][]{
				{0, 1, 2}, {0, 3, 6}, {0, 4, 8},
				{3, 4, 5}, {1, 4, 7}, {2, 4, 6},
				{6, 7, 8}, {2, 5, 8}};
		 
		 if(joueur == "X"){
			 for(int i = 0; i <8; i++){
				 if(contiensComb(CombGagneante[i], lespositionsX)){
					 pos[0] = CombGagneante[i][0];
					 pos[1] = CombGagneante[i][1];
					 pos[2] = CombGagneante[i][2];
					 return true;
				 }
			 }
		 } 
		 else if(joueur == "O"){
			 for(int i = 0; i <8; i++){
				 if(contiensComb(CombGagneante[i], lespositionsO)){
					 pos[0] = CombGagneante[i][0];
					 pos[1] = CombGagneante[i][1];
					 pos[2] = CombGagneante[i][2];
				     return true;
				 }
			 }
	 }
	return false;
 }
	   
	 /*Toutes les cellules sont occupées et il n'y a aucun gagnant */
	   public boolean isNulle(){
		  return TouteLesPositions.isEmpty();
	   }
}
