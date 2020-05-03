package harjoituksia_viikko8lisapackage;


import java.io.FileNotFoundException;  
import java.io.PrintWriter; //netistä haettu, saa kirjattua ns. tekstitiedostoon. Ei testattu oikeaan 
import java.util.ArrayList;
import java.util.Collections;

public class TiedostoTyokalut {

    private ArrayList<PainoMittaus> mittaukset;

    public TiedostoTyokalut() {
        this.mittaukset = new ArrayList<>();
    }

    public void lisaaMittaus(PainoMittaus mittaus) {
        mittaukset.add(mittaus);
    }

    public PainoMittaus[] lue() {
    	Collections.sort(mittaukset);
        PainoMittaus[] tulokset = new PainoMittaus[mittaukset.size()];
        for (int i = 0; i < mittaukset.size(); i++) {
            tulokset[i] = mittaukset.get(i);
        }
        return tulokset;
    }
    
    public void writeToTxt() {
    	try (PrintWriter out = new PrintWriter("painotcsv.txt")){
	    	for (int i=0; i<mittaukset.size(); i++) {
	    		out.println(mittaukset.get(i).toString());
	    	}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
