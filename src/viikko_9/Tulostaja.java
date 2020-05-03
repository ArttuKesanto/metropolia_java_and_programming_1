package viikko_9;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Tulostaja {
    public static void Tulosta(){
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            int first = Integer.parseInt(reader.next());

            System.out.print("Syötä toinen kokonaisluku: ");
            int second = Integer.parseInt(reader.next());

            // Laskin calc = new Laskin(); Static defined, no need for object.

            int total = Laskin.summa(first, second);

            System.out.println("Lukujen summa: " + total);


        } catch (Exception e) {
            System.out.println("Please input logical values, as in Integers...");
        }
    }
}
