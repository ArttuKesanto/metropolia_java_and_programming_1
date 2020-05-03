package harjoituksia5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tunnus {
	
	
	public static String teeTunnus(String etu, String suku) {
		String kayttajatunnus =  suku.substring(0, 3).toLowerCase() + etu.substring(0, 3).toLowerCase();
		return kayttajatunnus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna sukunimi: ");
		String sukunimi = reader.next();
		
		System.out.print("Anna etunimi: ");
		String etunimi = reader.next();
		
		if (etunimi.length() < 3 || sukunimi.length() < 3) {
			System.out.println("Käyttäjätunnusta ei voi luoda");
		}
		
		else {
		
		String kayttis = teeTunnus(etunimi, sukunimi);
		
		//System.out.println("Käyttäjätunnuksesi on: " + kayttis);
		System.out.println("Tunnus on " + kayttis);
		reader.close();
	}

}
}
