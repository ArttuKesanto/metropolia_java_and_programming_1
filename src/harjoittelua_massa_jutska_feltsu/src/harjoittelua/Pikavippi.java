package harjoittelua;

import java.util.Scanner;

public class Pikavippi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna pikavipin määrä euroissa: "); double pikavip = reader.nextDouble();
		//double pikavip = reader.nextDouble();
		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		int vuosi = reader.nextInt();
		System.out.print("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		int prossa = reader.nextInt();
		
		if (vuosi == 1) {
			//System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%: " + 41);
			double korko = (prossa / 100.00) * pikavip;
			System.out.print("Lainatut rahat maksavat eli korko " + korko);
		}
		else if (vuosi == 2) {
			//System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%: " + 37);
			double korko = (prossa / 100.00) * pikavip;
			System.out.print("Lainatut rahat maksavat eli korko " + korko);
			reader.close();
		} //kannattaa lisätä else vielä, jotta looppi toimii
	}

}
