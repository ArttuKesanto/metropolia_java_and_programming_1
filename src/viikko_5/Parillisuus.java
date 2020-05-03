package viikko_5;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Parillisuus {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Anna kokonaisluku: ");
            int number = Integer.parseInt(reader.next());
            int remains = (number % 2);

            if (remains == 0) {
                System.out.println("Luku " + number + " on parillinen.");
            } else {
                System.out.println("Luku " + number + " on pariton.");
            }

        } catch (Exception e){
            System.out.println("Input logical values...");
        }
    }
}
