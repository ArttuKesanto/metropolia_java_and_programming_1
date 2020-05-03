	package harjoituksiaosioviikko1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Katsastus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Onko kyseessä 1) katsastus vai 2) jälkitarkastus? (1 tai 2)");
		int tila = reader.nextInt();
		
		if (tila == 1) {
			 System.out.println("Mitataanko päästö? (1=kyllä tai 2=ei)");
			 int tila2 = reader.nextInt();
			 
			 if (tila2 == 1) {
				 System.out.println("Onko auto bensiiniauto vai dieselauto? (1=bensa, 2=diesel)");
				 int tila3 = reader.nextInt();
				 
				 if (tila3 == 1) {
					 System.out.println("Hinta on " + (50 + 22) + " euroa");
				 }
				 
				 else {
					 System.out.println("Hinta on " + (50 + 31) + " euroa");
				 }
				 
			 }
			 else {
				 System.out.println("Hinta on 50 euroa");
			 }
		}
		
		else {
			System.out.println("Hinta on 30 euroa");
		}
		
		
		
	}

}
