package harjoituksia6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sademaara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
		
		double smaara = 0.00;
		int i = 0;
		
		for (i = 0; i < sademaarat.length; i++) {
			smaara += sademaarat[i];
		}
		
		System.out.println("Vuotuinen sademäärä oli " + df.format(smaara) + " mm");
		reader.close();
	}

}
