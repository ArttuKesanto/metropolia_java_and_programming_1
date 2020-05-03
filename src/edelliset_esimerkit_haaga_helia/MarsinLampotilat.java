package edelliset_esimerkit_haaga_helia;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.ArrayList; // NOT IN USE.

public class MarsinLampotilat {
	
	private static int[] kysyMittaustulokset() {
	    // Luo tyhjä taulukko ja kysy siihen lämpötilat. Lopuksi palauta taulukko.

		System.out.println("Testing...");
		Scanner reader1 = new Scanner(System.in);
		int[] lampoTilat = new int[10];

		for (int i = 0; i < 10; i++) {
			lampoTilat[i] = 0;   // Esimerkki taulukosta Internetistä, alustetaan alkiot. Tarpeellista?
			
		}
		System.out.println("LOLLERO");
		
		int kerta = 1;
		for (int i = 0; i < 10; i++, kerta++) {
			//System.out.println("Syötä lämpötila välillä -140 ja 20 astetta: ");
			System.out.print("Syötä mittaus " + kerta + "/10: ");
			int asteluku = Integer.parseInt(reader1.next());
			//lampoTilat[i] = asteluku;
			if (asteluku < -140 || asteluku > 20) {
				i--;
				kerta--;
				// System.out.println("Ei lasketa, laita oikea luku annetulla välillä.");
				System.out.println("Anna lämpötila väliltä -140 - + 20!" + "\n");
				//lampoTilat.remove(lampoTilat.size()-1); Pitää tapahtua poisto.
				continue;
			}
			
			else {
				lampoTilat[i] = asteluku;
				//return lampoTilat;
			}
			
			//return lampoTilat;
		
	}
		return lampoTilat;
	}

	private static double laskeKeskiarvo(int[] tulokset) {
	    // Laske keskiarvo parametrina saadusta taulukosta ja palauta se liukulukuna.
		int total = 0;
		for (int i = 0; i < tulokset.length; i++) {
			total += tulokset[i];
		}
		return (double)total / tulokset.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");

		int[] mittaustulos = kysyMittaustulokset();
		double keskiarvoLuku = laskeKeskiarvo(mittaustulos);
		
		Arrays.sort(mittaustulos); // Ei saanut käyttää Arrays, mutta tämä oli ainoa mitä keksin.	
		
		//System.out.println("Keskiarvo luvuille oli: " + df.format(keskiarvoLuku) + " \nMaksimiarvo oli " + mittaustulos[mittaustulos.length -1] + " ja minimiarvo " + mittaustulos[0]);
		System.out.println(" \nMittausten keskiarvo: " + df.format(keskiarvoLuku));
		System.out.println("Pienin mittaustulos: " + mittaustulos[0]);
		System.out.println("Suurin mittaustulos: " + mittaustulos[mittaustulos.length -1]);
	}

}