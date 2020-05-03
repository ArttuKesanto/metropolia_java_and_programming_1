package PainoPaketi;

import java.util.Scanner;

public class PainoSovellus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        TiedostoTyokalut tyokalu = new TiedostoTyokalut();
        while (true) {
            tulostaValikko();
            try {
                int valinta = Integer.valueOf(lukija.nextLine());
                if (valinta == 0) {
                    break;
                } else if (valinta == 1) {
                    PainoMittaus mittaus = new PainoMittaus();
                    System.out.println("Anna paino (muodossa 9.9.2019,85):");
                    String input = lukija.nextLine();
                    if (!(input.matches("[\\d]{1,2}\\.[\\d]{1,2}\\.[\\d]{4},[\\d]{1,2}"))) {
                        System.out.println("Päivämäärä tai paino on väärässä muodossa (" + input + ")\n");
                        continue;
                    } else {
                    String[] jaettu = input.split(","); //jaetaan syöte pilkun kohdalta, splittailua
                    String[] pvm = jaettu[0].split("\\."); //jaetaan myös päivämäärä osiksi
                    int paino = Integer.parseInt(jaettu[1]);
                    mittaus.setPaino(paino);
                    mittaus.setPvm(new Pvm(pvm)); //syötetään mennyt päivämäärä mittaukselle
                    tyokalu.lisaaMittaus(mittaus); //lisätään mittaustulos "tiedostoon", myöhemmin erillinen tekstifilu.
                    }
                } else if (valinta == 2) { //tulostaa mittaustulokset graafina
                    Piirturi piirturi = new Piirturi();
                    piirturi.tulostaPainoKuvaaja(tyokalu.lue());
                } else if (valinta == 3) { //lisää mittauksen tälle päivälle
                    System.out.println("Anna paino (muodossa 85): ");
                    int paino = Integer.valueOf(lukija.nextLine());
                    PainoMittaus mittausTanaan = new PainoMittaus();
                    mittausTanaan.setPaino(paino);
                    String[] wrongDay = {"23","9","2019"};
                    mittausTanaan.setPvm(new Pvm(wrongDay));
                    tyokalu.lisaaMittaus(mittausTanaan);
                } else {
                    System.out.println("Virheellinen syöte, kokeile uudestaan");
                }
            } catch (NumberFormatException e){
                System.out.println("Tapahtui virhe: " + e + "\nYritä uudelleen");
            }
            System.out.println();
        }
        tyokalu.writeToTxt();
        lukija.close();
    }

    public static void tulostaValikko() {
        System.out.println("Valikko");
        System.out.println("0) Lopeta");
        System.out.println("1) Lisää painokirjaus menneelle päivälle");
        System.out.println("2) Tulosta painokuvaaja");
        System.out.println("3) Lisää painokirjaus tälle päivälle");
        System.out.print("Anna valintasi (0, 1, 2 tai 3): ");
    }
}