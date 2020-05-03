package harjoituksia5;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class Kulutus {

	
	static int kysyKilometrit() {
		Scanner reader1 = new Scanner(System.in);
		System.out.print("Anna ajetut kilometrit: ");
		int km = reader1.nextInt();
		return km;
	}
	
	static double kysyTankkaus() {
		Scanner reader1 = new Scanner(System.in);
		System.out.print("Anna tankattu määrä: ");
		double tankattumäärä = reader1.nextDouble();
		return tankattumäärä;
	}
	
	static double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus1 = (tankattu / kilometrit * 100.00);
		return kulutus1;
	}
	
	static void naytaKulutus(double kulutus) {
		DecimalFormat df = new DecimalFormat("0.00");
		//System.out.println("Kulutus oli " + df.format(kulutus) + " litraa sadalla kilometrillä");
		System.out.println("Kulutus/100km on " + df.format(kulutus) + " litraa");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.00");
		
		int kilsat = kysyKilometrit();
		
		double tankattu = kysyTankkaus();
		
		double kulutettu = laskeKulutus(kilsat, tankattu);
		
		naytaKulutus(kulutettu);
	}

}
