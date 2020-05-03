package harjoituksiaosioviikko1;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Palkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Anna palkka: ");
		int palkka = reader.nextInt();
		
		System.out.println("Anna veroprosentti: ");
		int verop = reader.nextInt();
		
		System.out.println("Anna ikä: ");
		int ikä = reader.nextInt();
		
		System.out.println("Bruttopalkka " + palkka);
		
		System.out.println("Veron osuus " + df.format(((verop / 100.00)) * palkka));
		
		if (ikä <= 62 && ikä >= 53) {
			System.out.println("Työeläkevakuutusmaksun osuus on " + df.format((0.0825 * palkka)));
			System.out.println("Työttömyysvakuutuksen osuus " + df.format((0.015 * palkka)));
			System.out.println("Käteen jää " + df.format((palkka - ((verop / 100.00) * palkka) - (0.0825 * palkka) - (0.015 * palkka))));
		}
		
		else {
			System.out.println("Työeläkevakuutusmaksun osuus on " + df.format((0.0675 * palkka)));
			System.out.println("Työttömyysvakuutuksen osuus " + df.format((0.015 * palkka)));
			System.out.println("Käteen jää " + df.format((palkka - ((verop / 100.00) * palkka) - (0.0675 * palkka) - (0.015 * palkka))));
		}
		
		
	}

}
