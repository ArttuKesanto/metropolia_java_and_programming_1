package harjoituksia;

import java.util.Scanner;

public class AlkuTulostin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Kirjoita sana: ");
		String word = reader.next();
		
		for (int i = 1; i <= word.length(); i++) {
			String wordNew = word.substring(0, (0 + i));
			System.out.println(wordNew);
		}
		reader.close();
	}

}
