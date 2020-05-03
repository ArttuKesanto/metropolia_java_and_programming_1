package viikko_3;

import java.io.*;
import java.util.Scanner;

public class Ava {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Anna ympyrän säde:");
            int r = Integer.parseInt(reader.next());

            double ala = (3.142 * (r * r));

            System.out.println("Ympyrän ala annetulla säteellä: " + ala);
        } catch (Exception e) {
            System.out.println("Please input logical values...");
        }
    }
}
