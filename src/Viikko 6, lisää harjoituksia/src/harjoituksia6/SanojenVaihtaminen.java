package harjoituksia6;

import java.util.Scanner;
import java.util.Arrays;

public class SanojenVaihtaminen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kirjoita lause:");
		String lause = reader.nextLine();
		
		String[] jono = lause.split(" ");
		
		System.out.println("Mitkä sanat vaihdetaan keskenään?");
		int ekasana = reader.nextInt();
		int tokasana = reader.nextInt();
		
		String alkupersana = jono[ekasana];
		String alkupersana1 = jono[tokasana];
		
		jono[ekasana] = alkupersana1;
		jono[tokasana] = alkupersana;
		
		String finaali = String.join(" ", jono);
		
		System.out.println(finaali);
		reader.close();
	}

}
