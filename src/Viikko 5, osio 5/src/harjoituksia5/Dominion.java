package harjoituksia5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Dominion {
	
	static int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		int yhteispisteet = ((kirous * (-1)) + (tila * 2) + (pitaja * 5) + (laani * 8));
		return yhteispisteet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna kirouskorttien määrä: ");
		int kirous = reader.nextInt();
		
		System.out.print("Anna tilakorttien määrä: ");
		int tila = reader.nextInt();
		
		System.out.print("Anna pitäjäkorttien määrä: ");
		int pitaja = reader.nextInt();
		
		System.out.print("Anna läänikorttien määrä: ");
		int laani = reader.nextInt();
		
		int yhteispistetulos = laskePisteet(kirous, tila, pitaja, laani);
		
		System.out.println("Pisteiden yhteismäärä on " + yhteispistetulos);
		
	}

}
