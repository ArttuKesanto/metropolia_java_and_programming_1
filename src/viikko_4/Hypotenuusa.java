package viikko_4;

import java.io.*;
import java.util.Scanner;
// import java.util.concurrent.ExecutionException;, NOT IN USE.

public class Hypotenuusa {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Anna ensimmäinen kateetti: ");
            int cathetusFirst = Integer.parseInt(reader.next());

            System.out.println("Anna toinen kateetti: ");
            int cathetusSecond = Integer.parseInt(reader.next());

            double hypotenuse = Math.sqrt((cathetusFirst*cathetusFirst) + (cathetusSecond*cathetusSecond));

            System.out.println("Hypotenuusan pituus: " + hypotenuse);
        } catch (Exception e) {
            System.out.println("Please input logical numbers...");
        }
    }
}
