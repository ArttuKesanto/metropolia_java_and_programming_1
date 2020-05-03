package harjoutuksiawhilefor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hissi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		int paino = 0;
		
		do {
			System.out.print("Paljonko painat: ");
			int annettupaino = reader.nextInt();
			paino += annettupaino;
			
		if (annettupaino == 0) {
			// System.out.println("Turvallista hissimatkaa!"); Ei saanut käyttää tässä, mutta olisi ollut fiksu ratkaisu.
			break;
		}
		
		else if (paino > 240.00) {
			System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
			break;
		}
			
		else {
			System.out.println("Tule kyytiin.");
		}
			
			
		}
		
		while (true);
	}

}
