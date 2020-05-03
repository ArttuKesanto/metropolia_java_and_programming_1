package harjoituksia_viikko8lisapackage;
import java.time.LocalDate;

public class Pvm {
	private int paiva;
	private int kuukausi;
	private int vuosi;
	
	public Pvm() {
		// LocalDate date = new LocalDate();
		this.paiva = LocalDate.now().getDayOfYear();
		this.kuukausi = LocalDate.now().getMonthValue();
		this.vuosi = LocalDate.now().getYear();
		
	}
	
	public Pvm (int paiva, int kuukausi, int vuosi) {
		this.paiva = paiva;
		this.kuukausi = kuukausi;
		this.vuosi = vuosi;
	}

	public int getPaiva() {
		return paiva;
	}

	public void setPaiva(int paiva) {
		this.paiva = paiva;
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

	@Override
	public String toString() {
		return "Pvm [paiva=" + paiva + ", kuukausi=" + kuukausi + ", vuosi=" + vuosi + "]";
	}
	
	

}
