package org.lessons.java.array;

public class CibiPreferiti {
public static void main(String[] args) {
	
//	Dichiaro all'array e lo popolo
	String[] favFood = new String [7];
	int ind = 0;
	favFood[ind++] = "Lasagna";
	favFood[ind++] = "Tortellini";
	favFood[ind++] = "Carbonara";
	favFood[ind++] = "Pizza";
	favFood[ind++] = "Fiorentina";
	favFood[ind++] = "Gelato";
	favFood[ind++] = "Pollo";
	
//	Stampo il numero di piatti nell'array ed il cibo in prima ed ultima posizione
	System.out.println("La classifca conta " + favFood.length + " piatti");
	System.out.println("Il mio cibo preferito è: " + favFood[0]);
	System.out.println("Il mio cibo preferito ma non troppo è: " + favFood[favFood.length - 1]);
	
//	Controllo,anche se non necessario, se la lunghezza dell'array è pari o dispari e stampo la mediana
	if (favFood.length % 2 == 0) {
		String median1 = favFood[favFood.length / 2];
		String median2 = favFood[favFood.length / 2 - 1];
		System.out.println("I piatti di mezza classifica sono: " + median1 + " e " + median2);
	} else {
		String median1 = favFood[favFood.length / 2];
		System.out.println("Il piatto di mezza classifica è: " + median1);
	}
}
}
