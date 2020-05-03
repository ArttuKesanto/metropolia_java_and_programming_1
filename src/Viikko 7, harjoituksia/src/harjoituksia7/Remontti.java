package harjoituksia7;
import java.time.LocalDate;

public class Remontti {
	private int vuosi;
	private String kuvaus;
	//private Henkilo hkl;
	
	
	public Remontti() {
		int nykyvuosi = LocalDate.now().getYear();
		this.vuosi = nykyvuosi;
	}


	public int getVuosi() {
		return vuosi;
	}


	public boolean setVuosi(int vuosi) {
		boolean yearFits = true;
		if (vuosi > LocalDate.now().getYear()) {
			yearFits = false;
			return yearFits;
		}
		else {
			this.vuosi = vuosi;
			return yearFits;
	}
	}


	public String getKuvaus() {
		return kuvaus;
	}


	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}


	@Override
	public String toString() {
		return ("Vuonna " + vuosi + " tehtiin remontti " + kuvaus);
	}
	
	

}
