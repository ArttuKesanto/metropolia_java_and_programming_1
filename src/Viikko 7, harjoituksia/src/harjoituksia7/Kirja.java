package harjoituksia7;

public class Kirja {
	private String nimi;
	private String isbn;
	private double hinta;
	private int julkaisuVuosi;
	
	public Kirja(String nimi, String isbn, double hinta, int julkaisuVuosi) { // Parametrillinen konstruktori.
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.julkaisuVuosi = julkaisuVuosi;
	}
	
	public Kirja() { // Parametriton konstruktori
		
	}
	
	
	
	
	
	//@Override
	//public String toString() {
		//return ("Nimi: " + nimi + "\nIsbn: " + isbn + "\nHinta: " + hinta + "\nJulkaisuvuosi: " + julkaisuVuosi);
	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", julkaisuvuosi=" + julkaisuVuosi + "]";
	}





	

	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
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
	public int getJulkaisuVuosi() {
		return julkaisuVuosi;
	}
	public void setJulkaisuVuosi(int julkaisuVuosi) {
		this.julkaisuVuosi = julkaisuVuosi;
	}
	
	
	
}
