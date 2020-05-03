package harjoituksia5;

import java.util.Scanner;

public class Kellonaika {
	
	
	
	public static String kysyKellonaika() {
		Scanner reader1 = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String kellonaika = reader1.next();
		return kellonaika;
		
	}
	
	public static boolean tarkastaKellonaika(String kellonaika) {
		if (kellonaika.matches("[0-2][0-4]:[0-5][0-9]")) {
			return true;
		}
		
		else {
			return false;
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		//boolean kelpaa = true;
		
		String klo = kysyKellonaika();
		boolean kelpaa = tarkastaKellonaika(klo);
		
		if (kelpaa == true) { // voisi olla myös if (kelpaa), koska kelpaa on true tai false...
			System.out.println("Kellonaika on oikein");
		}
		
		else {
			System.out.println("Kellonaika ei ole kelvollinen");
		}
	}

}
