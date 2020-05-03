package viikko_6;

import java.io.*;
import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        try{
            Scanner reader = new Scanner(System.in);
            System.out.print("Anna kokonaisluku:");
            int choice = Integer.parseInt(reader.next());
            int total = 1;

            for (int i = 1; i <= choice ; i++) { // Could also use while-loop on this.
                total *= i;
            }

            System.out.println("Luvun " + choice + " kertoma on " + total);

        } catch (Exception e) {
            System.out.println("Please input logical values...");
        }
    }
}
