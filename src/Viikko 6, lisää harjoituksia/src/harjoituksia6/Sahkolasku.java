package harjoituksia6;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Sahkolasku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		DecimalFormat df1 = new DecimalFormat("00");
		ArrayList<Double> slukema = new ArrayList<Double>();
		
		System.out.print("Anna kilowatin hinta euroina: ");
		// double kiloWatti = Double.valueOf(reader.nextLine()); 
		double kiloWatti = reader.nextDouble();
		
		int i = 1;
		while (i < 7) {
			System.out.print("Anna kuukauden " + i + " sähkölukema: ");
			double sLukema1 = reader.nextDouble();
			slukema.add(sLukema1);
			i++;
			
			
		}
		
		for (int tila = 0; tila < slukema.size(); tila++) { // size on arraylistojen koko...
			//int tila = 1;
			System.out.println((tila + 1) + ". kuukauden kulutus: " + df1.format(slukema.get(tila)) + "kWh " + df.format((slukema.get(tila)) * kiloWatti) + " euroa");
			//tila += 1;
		}
	}

}
