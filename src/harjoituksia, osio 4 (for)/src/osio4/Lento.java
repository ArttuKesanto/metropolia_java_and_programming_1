package osio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna lennon numero: ");
		String lentonro = reader.next();
		int nro = Integer.parseInt(lentonro.substring(2, 3)); // Stringin numerosta tehdään kokonaisluku.
		String ay = lentonro.substring(0, 2);
		// int lentonro1 = lentonro.charAt(2);
		// System.out.println(lentonro + " " + nro + " " + ay + " " + lentonro.charAt(2) + " " + lentonro1);
		//int lentonro1 = lentonro.charAt(2);
		if (ay.equals("AY")) {
			
			if (nro == 1) {
				System.out.println("Kaukolento");
			}
			
			else if (nro >=2 && nro <= 6) {
				System.out.println("Kotimaan lento");
			}
			
			else if (nro == 7) {
				System.out.println("Venäjän lento");
			}
			
			else {
				System.out.println("Muu lento");
			}
		}
		
		else {
			System.out.println("Ei ole Finnairin lento");
		}	
		reader.close();

}
}
