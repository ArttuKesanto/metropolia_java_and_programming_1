package harjoituksia7;

import java.util.Scanner; 
// import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
	
	static Remontti remppa = new Remontti();

	public static void teeRemontti() {
		Scanner reader1 = new Scanner(System.in);
		//Remontti remppa = new Remontti();
		while (true) {
		System.out.print("Anna vuosi: ");
		int yearGiven = reader1.nextInt();
		//remppa.setVuosi(yearGiven);
		
		if (!(remppa.setVuosi(yearGiven))) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa. Anna kunnollinen vuosi.");
			continue;
		}
		else {
			System.out.print("Anna kuvaus: ");
			//String descr = reader1.next();
			//remppa.setKuvaus(descr);
			
			reader1.nextLine();
			
			String descr = reader1.nextLine();
			remppa.setKuvaus(descr);
			
			// remppa.setKuvaus(descr);
			System.out.println(remppa.toString());
			//reader1.close();
			//reader1.close();
			break;
			
		}
		//reader1.close();
		}
	}
	
	public static void naytaRemontti() {
		//Remontti remppa = new Remontti();
		System.out.println("Vuosi: " + remppa.getVuosi());
		System.out.println("Kuvaus: " + remppa.getKuvaus());
	}
	
	public static void muutaRemontti() {
		Scanner reader1 = new Scanner(System.in);
		// Remontti remppa = new Remontti();
		System.out.print("Anna vuosi: ");
		int yearGiven = reader1.nextInt();
		//remppa.setVuosi(yearGiven);
		
		if (!(remppa.setVuosi(yearGiven))) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}
		else {
			System.out.print("Anna kuvaus: ");
			
			reader1.nextLine(); // Nollaa kuvauksen, jotta saadaan koko linjasto ilman "bugausta".
			
			String descr = reader1.nextLine();
			remppa.setKuvaus(descr);
			
			// reader1.nextLine();
			
			// remppa.setKuvaus(descr);
			System.out.println(remppa.toString());
			
		}
		//reader1.close();
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		Scanner reader = new Scanner(System.in);
		//reader.nextLine();
		System.out.println("1. Tee remontti");
		System.out.println("2. Näytä remonttitiedot");
		System.out.println("3. Muuta remonttia");
		System.out.println("0. Lopetus");
		System.out.print("Anna valintasi (0-3): ");
		//reader.nextLine();
		
		int choice = reader.nextInt();
		
		//reader.nextLine();
		
		if (choice == 0) {
			break;
			// teeRemontti();
		}
		
		else if (choice == 1) {
			teeRemontti();
			System.out.println("");
			continue;
		}
		
		else if (choice == 2) {
			naytaRemontti();
			System.out.println("");
			continue;
		

	}
		else if (choice == 3) {
			muutaRemontti();
			System.out.println("");
			continue;
}
		else {
			System.out.println("Syötä sopiva luku!");
			System.out.println("");
			continue;
		}
	}
}
}

