package harjoutuksiawhilefor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvähennys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		double kotitvah = 0;
		do {
			System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
			double annettukorvaus = reader.nextDouble();
			
			kotitvah += annettukorvaus;
			
			if (annettukorvaus == 0) {
				break;
			}
		}
		
		while (true);
		
		String totaalimaara = df.format(((kotitvah * 0.50) - 100.00));
		
		if (((kotitvah * 0.50) - 100.00) >= 2400.00) {
			System.out.println("Kotitalousvähennyksen määrä on 2400,00 euroa");
		}
		
		else if (((kotitvah * 0.50) - 100.00) < 0.00) {
			System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
			
		}
		
		
		else {
		
		System.out.println("Kotitalousvähennyksen määrä on " + totaalimaara +" euroa");
		reader.close();
	}

	}
	}
