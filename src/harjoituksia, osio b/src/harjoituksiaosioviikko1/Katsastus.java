package harjoituksiaosioviikko1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Katsastus {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int hinta = 0;
		
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int tila = reader.nextInt();
		
		System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
		int tila2 = reader.nextInt();
		
		System.out.println("Onko auto 0=bensa, 1=diesel: ");
		int tila3 = reader.nextInt();
		
		if (tila == 1 && tila2 == 0) {
			System.out.print("Hinta on " + 50);
		}
		
		else if (tila == 2 && tila2 == 0) {
			System.out.print("Hinta on " + 30);
		}
		
		else if (tila == 1 && tila2 == 1 && tila3 == 0) {
			System.out.print("Hinta on " + (50 + 22));
		}
		
		else if (tila == 1 && tila2 == 1 && tila3 == 1) {
			System.out.println("Hinta on " + (50 + 31));
		}
		
		else if (tila == 2 && tila2 == 1 && tila3 == 0) {
			System.out.println("Hinta on " + (30 + 22));
		}
		else {
				System.out.println("Hinta on " + (30+31));
		}
		}
}
	

