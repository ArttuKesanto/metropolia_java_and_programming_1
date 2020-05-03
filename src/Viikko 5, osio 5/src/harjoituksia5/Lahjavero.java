package harjoituksia5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lahjavero {
	
	static double laskeVero(double veronarvo) {
		//double veronmäärä;
		//return veronmäärä;
		if (veronarvo < 25000.00 && veronarvo >= 5000.00) {
			double veronmäärä = ((veronarvo - 5000.00) * 0.08 + 100.00);
			return veronmäärä;
		}
		
		else if (veronarvo >= 25000.00 && veronarvo < 55000.00) {
			double veronmäärä = ((veronarvo - 25000.00) * 0.10 + 1700.00);
			return veronmäärä;
		}
		
		else if (veronarvo >= 55000.00 && veronarvo < 200000.00) {
			double veronmäärä = ((veronarvo - 55000.00) * 0.12 + 4700.00);
			return veronmäärä;
		}
		
		else if (veronarvo >= 200000.00 && veronarvo < 1000000.00) {
			double veronmäärä = ((veronarvo - 200000.00) * 0.15 + 22100.00);
			return veronmäärä;
		}
		
		else if (veronarvo >= 1000000.00) {
			double veronmäärä = ((veronarvo - 1000000.00) * 0.17 + 142100.00);
			return veronmäärä;
		}
		
		else {
			//System.out.println("Lahjaveroa ei mene!");
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Anna lahjan suuruus: ");
		double veronarvo = reader.nextDouble();
		
		double lahjavero = laskeVero(veronarvo);
		
		System.out.println("Lahjavero on " + df.format(lahjavero) + " euroa");
		
		reader.close();
		
	}	

}
