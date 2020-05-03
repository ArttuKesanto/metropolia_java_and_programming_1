package viikko_8;

import java.io.*;
import java.util.Scanner;

public class Tunnit {
    public static void main(String[] args) {
        try {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana\n" +
                "tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");
        System.out.println();
        System.out.println("Kuinka monta päivää:");
        int days = Integer.parseInt(reader.next());
        int i = 1;
        double hours = 0;
        double[] table = new double[30];


            for (int j = 0; j < days ; j++, i++) {
                if (days > 30) {
                    System.out.println("Please input a value of 30 or less.");
                    break;
                }
                Scanner reader1 = new Scanner(System.in);
                System.out.println("Anna " + i + ". päivän työtunnit:");
                double hoursInserted = Double.parseDouble(reader.next());
                hours += hoursInserted;
                table[j] = hoursInserted;

            }
            System.out.println();
            System.out.println("Tehdyt työtunnit yhteensä: " + hours);
            System.out.println("Keskimääräinen työpäivän pituus: " + (hours/days));

            System.out.print("Syötetyt tunnit: ");

            for (int j = 0; j < days ; j++) {
                System.out.print(table[j] + " ");
            }

    } catch (Exception e){
            System.out.println("Please input logical values...");
        }
} }
