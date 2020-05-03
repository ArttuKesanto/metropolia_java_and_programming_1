package viikko_9;

public class KoiranTesti {
    public static void main(String[] args) {
        Koira rekku = new Koira(2, "Rekku", "Dalmatialainen", "Hau!!!");
        System.out.println("Koiran tiedot:");
        rekku.tulosta_tiedot();
        System.out.println("\nKoira sanoo: " + rekku.annaAani());
    }
}
