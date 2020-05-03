package harjoituksiaosioviikko1;

import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna tunnit: ");
		int tunnit = lukija.nextInt();
		
		if (tunnit >=7 && tunnit < 10) {
			System.out.print("Hyvää huomenta!");
		}
		
		else if (tunnit >= 10 && tunnit < 17) {
			System.out.print("Hyvää päivää!");
		}
		
		else if (tunnit >= 17 && tunnit < 22) {
			System.out.print("Hyvää iltaa!");
		}
		
		else {
			System.out.print("Hyvää yötä!");
			
		}
		lukija.close();
	}

}
