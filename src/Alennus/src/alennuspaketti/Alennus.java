package alennuspaketti;
import java.util.Scanner;

public class Alennus {
	
	public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Anna alentamaton hinta: ");
	double luku1 = reader.nextDouble();
	
	System.out.println("Anna alennusprosentti: ");
	int luku2 = reader.nextInt();
	
	double finaali = luku1 * (100.0 - luku2) / 100.0;
	
	// System.out.printf("Uusi hinta on " "%.2f" + (double)finaali);
	
	System.out.printf("Alennettu hinta on " + "%.2f", finaali);
	reader.close();
}
	
}
