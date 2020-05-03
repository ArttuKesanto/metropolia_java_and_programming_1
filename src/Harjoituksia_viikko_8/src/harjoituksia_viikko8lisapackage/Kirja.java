package harjoituksia_viikko8lisapackage;

public class Kirja {
	
	// public static Kustantaja kustantaja = new Kustantaja();
	
	private String nimi;
	// private String kustantaja;
	private String kustantajanimi;
	private String kustantajaosoite;
	private String kustantajapuhelin;
	private String isbn;
	private double hinta;
	private int julkaisuvuosi;
	private Kustantaja kustantaja; // tällä tavalla luodaan oikeaoppisesti luokan ilmentymä, eli objekti attribuutiksi.
	
	public Kirja() { // parametriton konstruktori
		
	}
	
	public Kirja(String nimi, String isbn, int julkaisuvuosi, double hinta) { // parametrillinen konstruktori
		this.nimi = nimi;
		this.isbn = isbn;
		this.julkaisuvuosi = julkaisuvuosi;
		this.hinta = hinta;
		//this.kustantaja = null;
	}

	public void addKustantaja(Kustantaja kustantaja) { // lisätään luokka Kustantajan tiedot tänne, koodina koko homma, yhteys?!
		this.kustantaja = kustantaja; 
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKustantajanimi() {
		return kustantajanimi;
	}

	public void setKustantajanimi(String kustantajanimi) {
		this.kustantajanimi = kustantajanimi;
	}

	public String getKustantajaosoite() {
		return kustantajaosoite;
	}

	public void setKustantajaosoite(String kustantajaosoite) {
		this.kustantajaosoite = kustantajaosoite;
	}

	public String getKustantajapuhelin() {
		return kustantajapuhelin;
	}

	public void setKustantajapuhelin(String kustantajapuhelin) {
		this.kustantajapuhelin = kustantajapuhelin;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public int getJulkaisuvuosi() {
		return julkaisuvuosi;
	}

	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}

	public Kustantaja getKustantaja() {
		return kustantaja;
	}

	public void setKustantaja(Kustantaja kustantaja) {
		this.kustantaja = kustantaja;
	}
	
	
	
}
