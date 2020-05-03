package viikko_2;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class Lasku {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number, number2;

            try {
                System.out.println("Anna ensimmäinen luku:");
                number = Integer.parseInt(reader.next());

                System.out.println("Anna toinen luku:");
                number2 = Integer.parseInt(reader.next());

                int total = (number + number2);

                System.out.println("Antamiesi lukujen summa on " + total);
            } catch (Exception e) {
                System.out.println("Anna kokonaislukuja!");
            }

            reader.close();
}
}