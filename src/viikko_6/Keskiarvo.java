package viikko_6;

import java.io.*;
import java.util.Scanner;

public class Keskiarvo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\n" +
                "Lopetus negatiivisella kokonaisluvulla.");
        int i = 0;
        int total = 0;
        while (true) {
            System.out.print("Anna arvosana (4-10):");
            int input = Integer.parseInt(reader.next());

            if (input >= 4 && input <= 10) {
                i++;
                total += input;
                //continue;
            } else if (input < 0) {
                break;
            } else {
                System.out.println("Syötä uusi luku uudestaan, 4-10...");
                continue;
            }
        }

        System.out.println("Ohjelmaan syötetty " + i + " arvosanaa. \n" +
                "Arvosanojen keskiarvo: " + ((double)total/i));
    }
}
