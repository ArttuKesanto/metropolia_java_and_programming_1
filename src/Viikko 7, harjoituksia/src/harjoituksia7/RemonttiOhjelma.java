package harjoituksia7;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remontti remppa = new Remontti();
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna vuosi: ");
		int yearGiven = reader.nextInt();
		//remppa.setVuosi(yearGiven);
		
		if (!(remppa.setVuosi(yearGiven))) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}
		else {
			System.out.print("Anna kuvaus: ");
			
			reader.nextLine();
			
			String descr = reader.nextLine();
			remppa.setKuvaus(descr);
			
			//reader.nextLine();
			
			// remppa.setKuvaus(descr);
			System.out.println(remppa.toString());
			
		}
		reader.close();
			

	}

}
