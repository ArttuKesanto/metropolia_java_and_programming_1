package harjoituksia6;

import java.util.Scanner;
import java.time.*;

public class Erapaiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String erapva = reader.next();
		
		if (erapva.matches("[1-2]0[1-9][0-9]-[0-1][0-9]-[0-3][0-9]")) {//Yritys saada edes joistakin päivämääristä virhehuomautuksia. Pitää olla oikea muoto.
			LocalDate date = LocalDate.parse(erapva);
			LocalDate eraPaivaOikea = date.plusDays(14);
			System.out.println("Eräpäivä on " + eraPaivaOikea);
			
		}
		
		else {
			System.out.println("Ei kelvollinen päivämäärä. Syötä uudestaan.");
		}
		reader.close();
		
	}
		

}
