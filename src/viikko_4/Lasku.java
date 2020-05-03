package viikko_4;

import java.util.Scanner;

public class Lasku {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Syötä ensimmäinen kokonaisluku:");
            int numberFirst = Integer.parseInt(reader.next()); // Try reader.nextline() as well...
                                    // sout gets you println() SYSO....
                                    // kaksoisklikkaa koodia, yms. Saat getterit ja setterit.
                                    // fori (perus for-each loop)
                                    // for-each is also important.
                                    // Voi kirjoittaa suoraan koodia
                                    // CMD + ALT + L tämä wrappaa kaikki sisennykset oikeiksi.
            System.out.println("Syötä toinen kokonaisluku: ");
            int numberSecond = Integer.parseInt(reader.next());
            int total = numberFirst + numberSecond;
            int totalSecond = numberFirst - numberSecond;
            int totalThird = numberFirst * numberSecond;
            double totalFourth = ((double)numberFirst / numberSecond); // Remember tyyppimuunnos, jos ekan muuttaa koko laskutoimitus muuttuu double-tietotyypiksi.
            int totalFifth = numberFirst % numberSecond;
            System.out.println(numberFirst + "+" + numberSecond + " " + "=" + " " + total);
            System.out.println(numberFirst + "-" + numberSecond + " " + "=" + " " + totalSecond);
            System.out.println(numberFirst + "*" + numberSecond + " " + "=" + " " + totalThird);
            System.out.println(numberFirst + "/" + numberSecond + " " + "=" + " " + totalFourth);
            System.out.println("Jakojäännös: " + totalFifth);

        } catch (Exception e) {

        }
    }
}
