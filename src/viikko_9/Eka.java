package viikko_9;

import java.io.*;

public class Eka {
    public static void main(String[] args)
    {
        String merkkijono;
        BufferedReader olio = new BufferedReader(new InputStreamReader(System.in));
        TulostusLuokka tulostaja = new TulostusLuokka();

        try{
            System.out.println("Anna merkkijono, jonka tulostan: ");
            merkkijono = olio.readLine();
            tulostaja.Tulosta(merkkijono);

        }catch (Exception e){
            System.out.println("Ei toimi.");

        }
    }
}
