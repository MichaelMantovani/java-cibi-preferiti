package org.lessons.java.array;

public class CibiPreferiti {
public static void main(String[] args) {
	String[] favFood = new String [7];
	int ind = 0;
	favFood[ind++] = "Lasagna";
	favFood[ind++] = "Tortellini";
	favFood[ind++] = "Carbonara";
	favFood[ind++] = "Pizza";
	favFood[ind++] = "Fiorentina";
	favFood[ind++] = "Gelato";
	favFood[ind++] = "Friggione";
	
	
	System.out.println("La classifca conta " + favFood.length + " piatti");
	System.out.println("Il mio cibo preferito è: " + favFood[0]);
	System.out.println("Il mio cibo preferito ma non troppo è: " + favFood[favFood.length - 1]);
}
}
