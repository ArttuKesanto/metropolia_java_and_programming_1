package viikko_5;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Tulotus {
    public static void main(String[] args) {
        try {
        Scanner reader = new Scanner(System.in);
        System.out.println("Oletko mies vai nainen (m/n)?");
        String gender = (reader.next()).toLowerCase();
            //System.out.println(gender);

        System.out.println("Anna ikäsi: ");
        int age = Integer.parseInt(reader.next());

            if ( gender.equals("m") && age >= 0 && age <= 55 ) {
                System.out.println("Olet mies parhaassa iässä!");
            } else if ( gender.equals("m") && age >= 56 && age <= 100 ) {
                System.out.println("Olet viisas mies!");
            } else if ( gender.equals("n") && age >= 0 && age <= 55 ) {
                System.out.println("Olet neito kauneimmillaan!");
            } else if ( gender.equals("n") && age >= 56 && age <= 100 ) {
                System.out.println("Olet nuori ikäiseksesi!");
            } else {
                System.out.println("Ohjelmassa on tapahtunut virhe.");
            }

    } catch (Exception e) {
            System.out.println("Ohjelmassa on tapahtunut virhe.");
        }
}}
