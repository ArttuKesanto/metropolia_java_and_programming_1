package viikko_3;

import java.io.*;
import java.util.Scanner;

public class Euro {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Syötä jokin markkamäärä: ");
            double mark = Double.parseDouble(reader.next());

            double euros = (mark / 5.94573);

            System.out.println("Markat euroina: " + euros);

        } catch (Exception e) {
            System.out.println("Input a numeric, logical value.");
        }
    }
}
