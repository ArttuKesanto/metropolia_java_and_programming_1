package harjoituksia7;

public class PainoMittaus implements Comparable<PainoMittaus>{
	private int paino;
	private Pvm pvm;
	
	public PainoMittaus() {
		this.pvm = new Pvm();
	}

	public int getPaino() {
		return paino;
	}

	public void setPaino(int paino) {
		this.paino = paino;
	}

	public Pvm getPvm() {
		return pvm;
	}

	public void setPvm(Pvm pvm) {
		this.pvm = pvm;
	}

	@Override
	public String toString() {
		return this.pvm.toString() + "," + this.paino;
	}

	@Override
    public int compareTo(PainoMittaus o) {
		if (this.pvm.aiemmin(o.getPvm())) {
			return -1;
		} else if (!(this.pvm.aiemmin(o.getPvm()))) {
			return 1;
		} else {
			return 0;
		}
	}
}