package harjoittelua;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna kansanedustajien lukumäärä: ");
		int kansluk = reader.nextInt();
		
		System.out.println("Puoluetuen määrä on " + (148175 * kansluk) + " euroa");
		reader.close();
		
	}

}
