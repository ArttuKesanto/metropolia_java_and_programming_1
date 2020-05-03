package osio4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Tuotteet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Annan tuotenumero: ");
		int tnro = reader.nextInt();
		
		System.out.print("Anna tuotteen nimi: ");
		String tnimi = reader.next();
		
		System.out.print("Anna tuotteen hinta: ");
		double thinta = reader.nextDouble();
		
		System.out.print("Anna tuotteen kuvaus: ");
		String tkuvaus = reader.next();
		String tkuvaus1 = tkuvaus.trim();
		
		System.out.println("Numero: " + tnro);
		
		String tnimi1 = tnimi.trim().toUpperCase();
		System.out.println("Nimi: " + tnimi1);
		
		String thinta1 = df.format(thinta);
		System.out.println("Hinta: " + thinta1);
		
		if (tkuvaus.isEmpty()) {
			System.out.println("Kuvaus: ");
		}
		
		else {
		//String tkuvaus1 = tkuvaus.trim();
		System.out.println("Kuvaus: " + tkuvaus1);
		reader.close();	
		
	}

}
}
