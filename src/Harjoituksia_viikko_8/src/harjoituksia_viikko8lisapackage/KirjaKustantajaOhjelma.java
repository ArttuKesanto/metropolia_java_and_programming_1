package harjoituksia_viikko8lisapackage;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {
	
	// static Kustantaja kustantaja = new Kustantaja(); // pääsee käsiksi ilman olioita tai viittauksia.
	// static Kirja book = new Kirja(); // + muuttuu tiedot kaikilla, "monopoli", ei uutta ilmentymää.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		Kustantaja kustantaja = new Kustantaja();
		Kirja book = new Kirja("Java-ohjelmointi", "", 2018, 65.50); // toimii
		
		//book = Kirja("Java-ohjelmointi", "", 2018, 65.50);
		//Kustantaja kustantaja = new Kustantaja();
		//Kustantaja kustantaja = new Kustantaja();
		//Kirja book = new Kirja();
		//book.setNimi("Java-ohjelmointi");
		//book.setIsbn("");
		//book.setHinta(65.50);
		//book.setJulkaisuvuosi(2018); // voisi tehdä myös parametrisellä konstruktorilla, Kirja (String nimi, String isbn, int julkaisuvuosi, double hinta)
		
		// Kustantaja kustantaja = new Kustantaja();
		
		System.out.println("Anna kustantajan nimi: ");
		String publisher = reader.nextLine();
		kustantaja.setNimi(publisher);
		// book.setKustantajanimi(publisher);
		
		System.out.println("Anna kustantajan osoite: ");
		String address = reader.nextLine();
		// address = address.replace("C", "K"); // pitää muistaa tallentaa muuttujaan ja käyttää tätä. Ei tallennusta, käyttää alkuperäistä muuttujaa.
		kustantaja.setOsoite(address);
		// book.setKustantajaosoite(address);
		
		// address.replace("C", "K");
		
		System.out.println("Anna kustantajan puhelinnumero: ");
		String number = reader.nextLine();
		kustantaja.setPuhelin(number);
		// book.setKustantajapuhelin(number);
		book.addKustantaja(kustantaja); //yhteys luotu. Lisää koodinpätkän tänne Kirja-luokasta kustantajan arvoilla.
		
		System.out.println("Kustantajan nimi: " + book.getKustantaja().getNimi());
		System.out.println("Kustantajan osoite " + book.getKustantaja().getOsoite());
		System.out.println("Kustantajan puhelin: " + book.getKustantaja().getPuhelin());
		
		System.out.println("Kirjan " + book.getNimi() + " kustantaja on " + book.getKustantaja().getNimi());
		
		reader.close();
		
		

	}

}
