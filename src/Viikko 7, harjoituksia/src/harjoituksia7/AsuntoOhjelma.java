package harjoituksia7;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asunto apartment = new Asunto();
		
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppias = reader.nextLine();
		apartment.setTyyppi(tyyppias);
		
		System.out.print("Anna osoite: ");
		String osoiteJutska = reader.nextLine();
		apartment.setOsoite(osoiteJutska);
		
		System.out.print("Anna pinta-ala: ");
		double alaLuku = reader.nextDouble();
		apartment.setAla(alaLuku);
		
		System.out.print("Anna hinta: ");
		double hintaLuku = reader.nextDouble();
		apartment.setHinta(hintaLuku);
		
		reader.nextLine();
		
		System.out.print("Anna kuvaus: ");
		String kuvasJuttu = reader.nextLine();
		apartment.setKuvaus(kuvasJuttu);
		
		System.out.print("\n");
		System.out.print(apartment.toString());
	}

}
