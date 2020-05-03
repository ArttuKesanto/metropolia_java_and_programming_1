package harjoittelua;
import java.util.Scanner;

public class MassaEsimerkki {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Artun protskudieetti, syötä nykyinen arvo ja paina Enter!");
	double paino = reader.nextDouble();
	
	while (true) {
		System.out.println("Valitse, millä haluat kasvattaa massaa");
		System.out.println("Vaihtoehdot: a) 400g proteiinijauhetta, b) 5 kpl proteiinipatukoita, c) proteiinismoothie");
		System.out.println("Valitse minkä tuotteen haluat kirjoittamalla (a, b, c) ja paina Enter!");
		
		char valinta = reader.next().charAt(0);
		switch (valinta) {
		
		case 'a':
			paino += 30;
			System.out.println("Sinun painosi on nyt " + paino + "kiloa!");
			continue;
			
		case 'b':
			paino += 10;
			System.out.println("Sinun painosi on nyt " + paino + "kiloa!");
			continue;
			
		case 'c':
			paino += 5;
			System.out.println("Sinun painosi on nyt " + paino + "kiloa!");
			continue;
		}
		
		if (paino <= 200) {
			System.out.println("Hieno homma, jatka lisää!");
		}
		
		else {
			System.out.println("Fatty! Get some help, asshole!");
			reader.close();
			break;
		}
	}
}
}
