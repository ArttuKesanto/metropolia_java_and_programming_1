package harjoituksia_viikko8lisapackage;

//package harjoituksia7;
import java.time.LocalDate;

public class Remontti {
	private int vuosi;
	private String kuvaus;
	private Henkilo hkl;
	
	
	public Remontti() {
		int nykyvuosi = LocalDate.now().getYear(); // ei tarvitse olla tässä koodissa, koska boolean alempana.
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
	public Henkilo getHkl() {
		return hkl;
	}
	public void setHkl(Henkilo hkl) {
		this.hkl = hkl;
	}
	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + ", hkl=" + hkl + "]";
	}
	
	
	
	

}

