package harjoittelua;
import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna juhliin tulevien aikuisten määrä: ");
		double aikmäärä = reader.nextDouble();
		
		double pulloja = aikmäärä / 7;
		int pulloja1 = ((int)(Math.ceil(pulloja)));
		
		//int pulloja2 = Integer.parseInt(pulloja1);
		reader.close();
		
		System.out.println("Pulloja tarvitaan " + pulloja1 + " kappaletta." + "\n" 
		+ "Viimeisestä pullosta jää " + (pulloja1 * 7 - ((int)aikmäärä)) + " lasillista.");
				
				
				
				// " + "\n" + "Viimeisestä pullosta jää " + ((pulloja1 * 7) - (aikmäärä * 7)));

	}

}
