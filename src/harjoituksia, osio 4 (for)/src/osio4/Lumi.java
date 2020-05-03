package osio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		int i = 0;
		int luminimia = 0;
		
		
		
		do {
			System.out.print("Anna nimi: ");
			String nimi = reader.nextLine();
			String nimipienella = nimi.toLowerCase(); //pieneksi kaikki stringit, nimet.
			i++;
			//System.out.println(nimipienella + " " + nimi);
			
			if (nimipienella.equals("lumi")) {
				luminimia++;
			}
			
			else if (nimi.equals("LOPPU")) {
				break; //lopettaa loopin.
			}
			
			
			else {
				continue;
			}
			
			
			
		//}
		
		//if (nimi == "LOPPU") {
			
		}
			
		
		while (true);
		
		System.out.println("Nimiä oli " + (i - 1) + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + luminimia + " kertaa.");
		reader.close();
	}
	
		

}
