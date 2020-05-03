package harjoituksia6;

import java.util.Scanner;    
import java.util.ArrayList;
import java.util.Collections;

public class Lampotilat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> lTilaArray = new ArrayList<Integer>(); // Voi olla lopussa ArrayList<>();
		
		int i = 0;
		// double [] lampotilat = {};
		
		while (i <= 100) {
			i++; //laita vikaksi, mieluiten!
			System.out.print("Anna lämpötila: ");
			int ltila = Integer.valueOf(reader.nextLine());  // lukee siihen asti, että painetaan Enter eli rivinvaihto.
			// lampotilat += ltila;    // tähän breikki      // Double.valueOf(reader.nextLine();
															 // reader.nextLine() jos on stringi.
			lTilaArray.add(ltila);
			
			if (ltila == -999) {
				lTilaArray.remove(lTilaArray.size()-1); // Koska alkaa nollasta... Mieluusti ennen komentoja, helpompaa.
				break;
			}
			
			
		  
			
		}
		
		Collections.sort(lTilaArray);
		
		System.out.print("Annoit lämpötilat ");
		for (int loppuTulos : lTilaArray) {
			System.out.print(loppuTulos + ", " /* + i*/);
			reader.close();
		}
	}

}
