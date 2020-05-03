package viikko_6;

import java.io.*;
import java.util.Scanner;

public class Silmukka {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("Anna kokonaisluku: ");
            int choice = Integer.parseInt(reader.next());

            for (int i = 1; i <= choice ; i++) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Please input logical values... Integers, as to be so kind.");
        }
    }
}
