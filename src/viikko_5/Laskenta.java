package viikko_5;

import java.util.Scanner;

public class Laskenta {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);

            System.out.println("Käytössäsi on seuraavat laskutoimitukset:\n" +
                    "1: vähennyslasku\n" +
                    "2: yhteenlasku\n" +
                    "3: kertolasku\n" +
                    "4: osamäärä\n" +
                    "5: jakojäännös");
            System.out.println(); // For making a space...
            System.out.println("Valitse laskutoimitus:");
            int option = Integer.parseInt(reader.next());

            switch (option) {
                case 2: {
                    System.out.println("Anna eka luku:");
                    int numberFirst = Integer.parseInt(reader.next());
                    System.out.println("Anna toka luku:");
                    int numberSecond = Integer.parseInt(reader.next());

                    int total = numberFirst + numberSecond;
                    System.out.println(numberFirst + "+" + numberSecond + " " + "=" + " " + total);
                    break;
                }
                case 1: {
                    System.out.println("Anna eka luku:");
                    int numberFirst = Integer.parseInt(reader.next());
                    System.out.println("Anna toka luku:");
                    int numberSecond = Integer.parseInt(reader.next());

                    int totalSecond = numberFirst - numberSecond;
                    System.out.println(numberFirst + "-" + numberSecond + " " + "=" + " " + totalSecond);
                    break;
                }
                case 3: {
                    System.out.println("Anna eka luku:");
                    int numberFirst = Integer.parseInt(reader.next());
                    System.out.println("Anna toka luku:");
                    int numberSecond = Integer.parseInt(reader.next());

                    int totalThird = numberFirst * numberSecond;

                    System.out.println(numberFirst + "*" + numberSecond + " " + "=" + " " + totalThird);
                    break;
                }
                case 4: {
                    System.out.println("Anna eka luku:");
                    int numberFirst = Integer.parseInt(reader.next());
                    System.out.println("Anna toka luku:");
                    int numberSecond = Integer.parseInt(reader.next());

                    double totalFourth = ((double) numberFirst / numberSecond);

                    int finalFourth = (int) totalFourth;
                    System.out.println(numberFirst + "/" + numberSecond + " " + "=" + " " + finalFourth);
                    break;
                }
                case 5: {
                    System.out.println("Anna eka luku:");
                    int numberFirst = Integer.parseInt(reader.next());
                    System.out.println("Anna toka luku:");
                    int numberSecond = Integer.parseInt(reader.next());

                    int totalFifth = numberFirst % numberSecond;

                    System.out.println(numberFirst + "%" + numberSecond + " " + "=" + " " + totalFifth);
                    break;
                }
                default: {
                    System.out.println("Please input logical values...");
                    break;
                }
            }

                /*System.out.println("Anna eka luku:");
                int numberFirst = Integer.parseInt(reader.next()); // Try reader.nextline() as well...
                // sout gets you println() SYSO....
                // kaksoisklikkaa koodia, yms. Saat getterit ja setterit.
                // fori (perus for-each loop)
                // for-each is also important.
                // Voi kirjoittaa suoraan koodia
                // CMD + ALT + L tämä wrappaa kaikki sisennykset oikeiksi.
                System.out.println("Anna toka luku:");
                int numberSecond = Integer.parseInt(reader.next());
                int total = numberFirst + numberSecond;
                int totalSecond = numberFirst - numberSecond;
                int totalThird = numberFirst * numberSecond;
                double totalFourth = ((double) numberFirst / numberSecond); // Remember tyyppimuunnos, jos ekan muuttaa koko laskutoimitus muuttuu double-tietotyypiksi.
                int totalFifth = numberFirst % numberSecond;
                System.out.println(numberFirst + "+" + numberSecond + " " + "=" + " " + total);
                System.out.println(numberFirst + "-" + numberSecond + " " + "=" + " " + totalSecond);
                System.out.println(numberFirst + "*" + numberSecond + " " + "=" + " " + totalThird);
                System.out.println(numberFirst + "/" + numberSecond + " " + "=" + " " + totalFourth);
                System.out.println("Jakojäännös: " + totalFifth); */

        } catch (Exception e) {
            System.out.println("Please input logical values...");
        }
    }
}
