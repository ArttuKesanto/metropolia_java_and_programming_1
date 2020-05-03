package PainoPaketi;

public class Piirturi {

    public Piirturi() {
    }

    public void tulostaPainoKuvaaja(PainoMittaus[] tulokset) {
        int pieninKymmenes = selvitaPieninKymmenes(tulokset);
        for (int i = 0; i < tulokset.length; i++) {
            int painoTulostettavaanMuotoon = tulokset[i].getPaino() - pieninKymmenes;
            for (int j = 1; j <= painoTulostettavaanMuotoon; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    //tällä saadaan graafi tulostamaan mahdollisimman vähän merkkejä
    //luettavuuden parantamiseksi
    public int selvitaPieninKymmenes(PainoMittaus[] tulokset) {
        int pienin = tulokset[0].getPaino();
        for (int i = 0; i < tulokset.length; i++) {
            int paino = tulokset[i].getPaino();
            if (paino < pienin) {
                pienin = paino;
            }
        }
        int pieninKymmenes = (pienin / 10) * 10; 
        return pieninKymmenes;
    }
}
