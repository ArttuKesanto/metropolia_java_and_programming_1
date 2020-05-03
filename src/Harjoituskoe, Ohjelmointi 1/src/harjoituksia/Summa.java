package harjoituksia;

import java.util.Scanner;

public class Summa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna ensimmäinen luku: ");
		int firstNumber = reader.nextInt();
		
		System.out.print("Anna toinen luku: ");
		int secondNumber = reader.nextInt();
		
		// int total = 0;
		int total = firstNumber + secondNumber;
		System.out.println("Lukujen summa on " + total);
		reader.close();
	}

}
