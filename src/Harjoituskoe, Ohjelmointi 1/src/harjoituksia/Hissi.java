package harjoituksia;

public class Hissi {
	private int maksimiMatkustajat;
	private int maksimiPaino;
	//private Matkustaja matkustaja;
	
	
	
	public Hissi(int maksimiMatkustajat, int maksimiPaino) { // Parametrillinen konstruktori.
		this.maksimiMatkustajat = maksimiMatkustajat;
		this.maksimiPaino = maksimiPaino;
	}
	
	public boolean mahtuu(Matkustaja[] matkustajat) {
		int weight = 0;
		int matkustajia = 0;
		for (int i = 0; i < matkustajat.length; i++) {
			if (matkustajat[i] == null) {
				break;
			}
		weight += matkustajat[i].getPaino();
		matkustajia++;
	}
		if (weight <= maksimiPaino && matkustajia <= maksimiMatkustajat) {
			return true;
		}
		return false;
		
		
		
		
		
		
		//if (maksimiMatkustajat < matkustajat.length) {
		//	return false;
		//}
		
		//else if (matkustaja.getPaino() > maksimiPaino) {
		//	return false;
		//}
		
		//else {
		//	return true;
		//}
	}



	public int getMaksimiMatkustajat() {
		return maksimiMatkustajat;
	}



	public int getMaksimiPaino() {
		return maksimiPaino;
	}
	

}
