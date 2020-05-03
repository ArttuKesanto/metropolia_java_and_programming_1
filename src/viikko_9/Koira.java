package viikko_9;

public class Koira {
    int ika;
    String nimi, rotu, aani;

    public Koira() {
    }

    public Koira(int ika, String nimi, String rotu, String aani) {
        this.ika = ika;
        this.nimi = nimi;
        this.rotu = rotu;
        this.aani = aani;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getRotu() {
        return rotu;
    }

    public void setRotu(String rotu) {
        this.rotu = rotu;
    }

    public String getAani() {
        return aani;
    }

    public void setAani(String aani) {
        this.aani = aani;
    }

    //@Override
    public void tulosta_tiedot() {
        System.out.println("Nimi: " + nimi + '\n' +
                "Ikä: " + ika + '\n' +
                "Rotu: " + rotu);
    }

    public String annaAani() {
        return aani;
    }
}
