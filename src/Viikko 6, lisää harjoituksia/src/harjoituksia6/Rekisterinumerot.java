package harjoituksia6;

import java.util.Scanner;
import java.util.ArrayList;

public class Rekisterinumerot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		ArrayList<String> rekNumerot = new ArrayList<>();
		
		int i = 0;
		while (i < 20) {
			System.out.print("Anna rekisterinumero: ");
			String rekkari = reader.next();
			
			if (rekkari.equals("-")) {
				break;
			}
			rekNumerot.add(rekkari);
			
			
		}
		
		for (String rekisterit : rekNumerot) {
			System.out.println(rekisterit);
		}
	}

}
