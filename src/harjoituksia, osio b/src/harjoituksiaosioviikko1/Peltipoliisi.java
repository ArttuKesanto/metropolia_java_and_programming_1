package harjoituksiaosioviikko1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Peltipoliisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.print("Anna nopeutesi: ");
		int nopeus = reader.nextInt();
		
		int ylinopeus = (nopeus - 80);
		
		if (ylinopeus <= 20 && ylinopeus > 0) {
			System.out.println("Kyseesä on rikesakko, ei päiväsakkoa.");
		}
		
		else if (ylinopeus > 20) {
			System.out.println("Päiväsakko");
			System.out.println("Anna nettokuukausitulosi: ");
			double kktulot = reader.nextDouble();
			
			double päiväsakko = ((kktulot - 255) / 60);
			
			String päiväsakko1 = df.format(päiväsakko);
			
			if (päiväsakko < 6) {
				System.out.print("Päiväsakon määrä on 6,00 euroa");
			}
			
			else {
				System.out.print("Päiväsakon määrä on " + päiväsakko1 + " euroa");
			}
		}
		
		else {
			System.out.print("Ei sakkoa.");
		}
		reader.close();
	}

}
