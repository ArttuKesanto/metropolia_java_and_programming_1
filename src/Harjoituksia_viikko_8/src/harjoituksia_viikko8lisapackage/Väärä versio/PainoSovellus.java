package harjoituksia_viikko8lisapackage;

import java.util.Scanner;

public class PainoSovellus {
	
	
	public static void tulostaValikko() {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Valikko");
			System.out.println("0) Lopeta");
			System.out.println("1) Lisää painokirjaus menneelle päivälle");
			System.out.println("2) Tulosta painokuvaaja");
			System.out.println("3) Lisää painokirjaus tälle päivälle");
			System.out.println("Anna valintasi (0, 1, 2 tai 3):");
			
			int choice = reader.nextInt();
			
			if (choice == 0) {
				break;
			}
			
			else if (choice == 1) {
				PainoMittaus painoMittaus = new PainoMittaus();
				
				System.out.println("Anna paino (muodossa 9.9.2019,85):");
				String giveninfo = reader.next();
				String[] pvmaara = giveninfo.split(",");
				
				
				//pvmaara[0] = "";
				//pvmaara[1] = "";
				painoMittaus.setPaino(pvmaara[1]);
				painoMittaus.setPaivamaara(paivamaara);
				painoMittaus.setKuukausi(kuukausi);
				painoMittaus.setVuosi(vuosi);
				
				
				
				System.out.println(pvmaara[0] + " "  + pvmaara[1]);
			}
			
			else if (choice == 2) {
				
			}
			
			else if (choice == 3) {
				
			}
			
			else {
				System.out.println("Anna kunnollinen luku, listasta.");
				continue;
			}
			
			
			
			
			
			
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tulostaValikko();

	}

}
