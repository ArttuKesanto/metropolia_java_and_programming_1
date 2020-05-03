package osio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Rekisteritunnus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna rekisterinumero: ");
		
		String rekisterinro = reader.next();
		int dash = rekisterinro.indexOf("-");
		//int length = rekisterinro.length();
		//int dash = rekisterinro.indexOf("-");
		//String start = rekisterinro.substring(0, (dash - 1));
		//String end = rekisterinro.substring(dash + 1);
		
		
		if (!(dash == -1)) { // Erittäin tärkeä tapa kokeilla true false -tyyppisiä juttuja. Jos löytyy, jatkuu koodi tänne.
			int length = rekisterinro.length();
			// int dash = rekisterinro.indexOf("-");
			String start = rekisterinro.substring(0, (dash - 1));
			String end = rekisterinro.substring(dash + 1);
			
				if (end.startsWith("0")) {
					System.out.println("Rekisterinumero ei ole kelvollinen");
				}
				
				else if (length < 4 || length > 7) {
					System.out.println("Rekisterinumero ei ole kelvollinen");
				}
				
				else if (start.length() < 1 || start.length() > 3) {
					System.out.println("Rekisterinumero ei ole kelvollinen");
				}
				
				else if (end.length() < 1 || end.length() > 3) {
					System.out.println("Rekisterinumero ei ole kelvollinen");
				}
				
				else {
					System.out.println("Rekisterinumero on kelvollinen");
				}
		}
		
		else {
			System.out.println("Rekisterinumero ei ole kelvollinen"); // En osaa tehdä chekkausta, onko alku pelkkä stringi ja loput kokonaisluku....
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String alkukirjaimet1 = rekisterinro.substring(0, 4);
		//String alkukirjaimet2 = rekisterinro.substring(0, 3);
		
		//int loppunro1 = Integer.parseInt(rekisterinro.substring(4, 7));
		//int loppunro2 = Integer.parseInt(rekisterinro.substring(3, 6));
		
		
		//System.out.println(rekisterinro.length() + " " + alkukirjaimet1 + " " + alkukirjaimet2 + " " + loppunro1 + " " + loppunro2);
		
		//if (rekisterinro.length() >= 4 && rekisterinro.length() <= 7) {
		//	System.out.println("Ok.");
		// }
		
		
		
		//else {
			// System.out.println("Ei kelpaa rekisterinumerona");
		//}
	}

}
