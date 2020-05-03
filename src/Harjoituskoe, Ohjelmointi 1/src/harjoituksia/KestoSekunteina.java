package harjoituksia;

import java.util.Scanner;

public class KestoSekunteina {
	
	
	
	private static int kestoSekunteina(int hours, int minutes, int seconds) {
		int total = 0;
		total = ((hours * 60 *60) + (minutes * 60) + seconds);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna tunnit: ");
		int hours = reader.nextInt();
		
		System.out.print("Anna minuutit: ");
		int minutes = reader.nextInt();
		
		System.out.print("Anna sekunnit: ");
		int seconds = reader.nextInt();
		
		int totalSeconds = kestoSekunteina(hours, minutes, seconds);
		
		System.out.println("Yhteensä " + totalSeconds + " sekuntia.");
		reader.close();
	}

}
