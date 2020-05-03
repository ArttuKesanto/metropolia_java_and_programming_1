package harjoittelua;

import java.util.Scanner;

public class Maalaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
		
		double leveys = reader.nextDouble();
		double pituus = reader.nextDouble();
		double korkeus = reader.nextDouble();
		
		System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
		double neliöt = reader.nextDouble();
		//reader.close();
		
		double maalia = (((leveys + leveys + pituus + pituus) * korkeus) / neliöt);
		//double maalia1 = Math.round(maalia * 100.00) / 100.00;
		//double maalia1 = round(maalia, 2);
		//double maalia1 = "%.2f", maalia;
		
		System.out.printf("Maalin tarve on " + "%.2f", maalia);
		System.out.println(" litraa");
		reader.close();
	
	}

}
