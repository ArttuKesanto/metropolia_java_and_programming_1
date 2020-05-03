package harjoituksia6;

import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Anna merkkijono: ");
		String merkkijono = reader.nextLine();
		
		String [] splitattu = merkkijono.split(" ");
		//String [] splitattu2 = splitattu.split(" ");
		//String lollero = splitattu[2];
		
		
		for (int i = 0; i < splitattu.length; i++) {
			System.out.println(splitattu[i]);
		}
		
		//System.out.println(splitattu + " " + merkkijono);
	}

}
