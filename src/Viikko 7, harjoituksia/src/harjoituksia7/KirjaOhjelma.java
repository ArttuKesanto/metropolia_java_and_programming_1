package harjoituksia7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class KirjaOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kirja book = new Kirja();
		// Kirja secondBook = new Kirja(kirjaNimi, isbn, kirjaHinta, jVuosi);
		
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.print("Anna nimi: ");
		String kirjaNimi = reader.nextLine();
		book.setNimi(kirjaNimi);
		
		System.out.print("Anna isbn: ");
		String isbn = reader.nextLine();
		book.setIsbn(isbn);
		
		System.out.print("Anna hinta: ");
		double kirjaHinta = reader.nextDouble();
		book.setHinta(kirjaHinta);
		
		System.out.print("Anna julkaisuvuosi: ");
		int jVuosi = reader.nextInt();
		book.setJulkaisuVuosi(jVuosi);
		
		System.out.println("");
		System.out.println(book);
		System.out.println("");
		
		System.out.println("Nimi: " + book.getNimi());
		System.out.println("Isbn: " + book.getIsbn());
		System.out.println("Hinta: " + df.format(book.getHinta()));
		System.out.print("Julkaisuvuosi: " + book.getJulkaisuVuosi());
		
		Kirja secondBook = new Kirja(kirjaNimi, isbn, kirjaHinta, jVuosi);
		//System.out.println(secondBook.toString());
		//System.out.println(secondBook.toString());
		
		// System.out.println("");
		
	}

}
