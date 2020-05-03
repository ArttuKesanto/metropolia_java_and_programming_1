package harjoituksia;

import java.util.Scanner;

public class HissiOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna hissin kapasiteetti (matkustajat): ");
		int matkustajat = reader.nextInt();
		
		System.out.print("Anna hissin kapasiteetti (paino): ");
		int paino = reader.nextInt();
		System.out.println("");
		
		Hissi elevator = new Hissi(matkustajat, paino);
		// Matkustaja passengers = new Matkustaja(paino);
		
		Matkustaja[] matkustaja = new Matkustaja[100];
		
		// int totalWeight = 0;
		// int matkustaja = 0;
		while (true) {
			System.out.print("Anna seuraavan matkustajan paino: ");
			int weight = reader.nextInt();
			//int totalWeight = 0;
			//totalWeight += weight;
			//matkustaja++;
			//matkustaja++;
			Matkustaja passenger = new Matkustaja(weight);
			//if (elevator.getMaksimiPaino() >= totalWeight && elevator.getMaksimiMatkustajat() >= matkustaja) {
				//matkustaja++;
				//continue;
			for (int i = 0; i < matkustaja.length; i++) {
				if (matkustaja[i] == null) {
					matkustaja[i] = passenger; // käydään läpi jo täytettyä listaa, ja lisätään seuraavaan null-kohtaan uusi Matkustaja-luokan ilmentymä, olio.
					break;
				}
			
				
			}
			
			//else {
			//	System.out.println("Matkustaja ei mahtunut");
			//	break;
			//}
			
			if (!(elevator.mahtuu(matkustaja))) {
				System.out.println("Matkustaja ei mahtunut.");
				break;
			}
		}
	}

}
