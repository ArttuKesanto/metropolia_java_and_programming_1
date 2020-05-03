package harjoituksia_viikko8lisapackage;

import java.util.Scanner;

public class RemonttiTekijaOhjelma {
	
	// static Remontti remppa = new Remontti(); Ei ole pakko luoda näin static, voi luoda objektin koodissa.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static Remontti remppa = new Remontti();
		Scanner reader = new Scanner(System.in);
		Remontti remppa = new Remontti();
		Henkilo hkl = new Henkilo();
		
		while (true) {
		System.out.print("Anna vuosi: ");
		int year = reader.nextInt();
		// remppa.setVuosi(year);
		if (!(remppa.setVuosi(year))) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa - anna oikea vuosi.");
			continue;
		}
		
		else {
			remppa.setVuosi(year);
			break;
		}
	}
		reader.nextLine(); // luo erotuksen ennen lukua intin / doublen jälkeen.
		
		// Remontti remppa = new Remontti();
		System.out.print("Anna kuvaus: ");
		String desc = reader.nextLine();
		remppa.setKuvaus(desc);	
		
		// Henkilo hkl = new Henkilo();
		System.out.print("Anna tekijän nimi: ");
		String name = reader.nextLine();
		hkl.setNimi(name);
		
		//reader.nextLine(); // sama, erotus ennen seuraavan lukemista.
		
		System.out.print("Anna tekijän osoite: ");
		String makerName = reader.nextLine();
		hkl.setOsoite(makerName);
		
		remppa.setHkl(hkl);
		
		System.out.println("Vuonna " + remppa.getVuosi() + " tehtiin remontti " + remppa.getKuvaus());
		System.out.println("Remontin teki " + remppa.getHkl().getNimi());
		
		reader.close();
		
		
		
		
		

}
}
