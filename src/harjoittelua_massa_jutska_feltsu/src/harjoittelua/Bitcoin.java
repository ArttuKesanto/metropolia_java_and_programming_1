package harjoittelua;
import java.util.Scanner;

public class Bitcoin {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");
		int raha = reader.nextInt();
		
		double tuotto = (raha * 15.06) - raha;
		
		System.out.print("Bitcoin tuotti vuodessa " + tuotto + " euroa");
		reader.close();
		
		
		
	}

}
