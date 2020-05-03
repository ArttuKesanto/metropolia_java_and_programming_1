package harjoituksia_viikko8lisapackage;

public class PainoMittaus {
	private Pvm date;
	private int paivamaara;
	private int kuukausi;
	private int vuosi;
	private double paino;
	
	//Pvm date = new Pvm();
	
	//int paino = 0;
	
	
	public PainoMittaus () {
		
	}

	
	
	
	public Pvm getDate() {
		return date;
	}

	public void setDate(Pvm date) {
		this.date = date;
	}

	public int getPaivamaara() {
		return paivamaara;
	}

	public void setPaivamaara(int paivamaara) {
		this.paivamaara = paivamaara;
	}

	public int getKuukausi() {
		return kuukausi;
	}

	public void setKuukausi(int kuukausi) {
		this.kuukausi = kuukausi;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	@Override
	public String toString() {
		return "PainoMittaus [date=" + date + ", paivamaara=" + paivamaara + ", kuukausi=" + kuukausi + ", vuosi="
				+ vuosi + ", paino=" + paino + "]";
	}

	
}



	
