package harjoutuksiawhilefor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilomterikorvaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		int km = 0;
		//System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		//int km = reader.nextInt();
		
		
		do {
		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		//int km = reader.nextInt();
		int kmlisätty = reader.nextInt();
		
		km += kmlisätty;
		
		//km += km;
		
		if (kmlisätty == 0) {
			break;
		}
		//
		//else {
		//km += kmlisätty;
		//}
	
	}
		while (true);
		
		
		
		System.out.println("Yhteensä " + km + " kilometriä");
		System.out.println("Korvaus on " + df.format((km * 0.43)) + " euroa");
		reader.close();

}
}