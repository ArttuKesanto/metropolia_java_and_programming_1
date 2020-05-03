package harjoutuksiawhilefor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Opintopisteet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna lukukausien määrä: ");
		int lukukausi = reader.nextInt();
		double opintopiste = 0;
		int i = 0;
		
		do {
			i ++;
			System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
			double opintopiste1 = reader.nextDouble();
			opintopiste += opintopiste1;
			
			
			
			
		}
		
		while (i > 0 && i < lukukausi);
		
		System.out.println("Sinulla pitäisi olla tähän mennessä " + df.format((lukukausi * 30.00)) + " opintopistettä.");
		System.out.println("Sinulla on " + df.format(opintopiste) + " opintopistettä.");
		
		if (opintopiste >= 210.00) {
			System.out.println("Tutkintosi on valmis, ellei pakollisia kursseja puutu! Onnea!");
			System.out.println("Tutkinnosta puuttuu vielä 0,00 opintopistettä.");
			
		}
		
		else if (opintopiste < (lukukausi * 30.00)) {
			System.out.println("Olet jäljessä tavoitteesta."); // Ekaksi kirjoitettu tavoitteestasta, ei mennyt läpi Viopessa!
			System.out.println("Tutkinnosta puuttuu vielä " + df.format(210.00 - opintopiste) + " opintopistettä.");
		}
		
		else if (opintopiste == (lukukausi * 30.00)) {
			System.out.println("Olet tavoitteessa.");
			System.out.println("Tutkinnosta puuttuu vielä " + df.format(210.00 - opintopiste) + " opintopistettä.");
		
		}
		
		else {
			System.out.println("Olet edellä tavoitteesta.");
			System.out.println("Tutkinnosta puuttuu vielä " + df.format(210.00 - opintopiste) + " opintopistettä.");
		}
	}

}
