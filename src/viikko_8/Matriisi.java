package viikko_8;

import java.io.*;
import java.util.*;

public class Matriisi {
    public static void main(String[] args)
    {
        int matriisi[][] = new int[5][5];
        int summa;
        String temp;

        try{
            BufferedReader syote = new BufferedReader(new FileReader("matriisi.txt")); // THIS FILE DOES WORK - just needs a file
            // ... to read from. Tested on Viope.
            for(int x = 0; x < 5; x++){
                temp = syote.readLine();
                StringTokenizer eroitin = new StringTokenizer(temp, "\t");

                for(int y = 0; y < 5; y++){
                    matriisi[x][y] = Integer.parseInt(eroitin.nextToken());
                }
            }
            syote.close();

            System.out.print("Matriisi:\n\n");
            tulosta_matriisi(matriisi);
            summa = laske_summa(matriisi);
            System.out.print("\nMatriisin alkioiden summa: " +summa);

        }catch(Exception e){
            System.out.print("Antamasi syöte oli virheellinen..." + e);
        }
    }
//    Metodit tulosta_matriisi() ja laske_summa()
//    kirjoitetaan tähän ...
    public static void tulosta_matriisi(int[][] matriisi) {
        for(int y=0; y<=4; y++) {
            for(int x=0; x<=4; x++) {
                int number = matriisi[y][x];

                if(x==4) {
                    System.out.println(number);
                } else {
                    System.out.print(number +"\t");
                }
            }
        }
        //return matriisi;
    }

    public static int laske_summa(int[][] matriisi) {
        int summa = 0;
        for(int y=0; y<=4; y++) {
            for(int x=0; x<=4; x++) {
                summa += matriisi[y][x];

               /* if(x==4) {
                    System.out.println(number);
                } else {
                    System.out.print(number +"\t");
                } */
            }

        }
        return summa;
    }

    /* for(y=0; y<3; y++) {
        for(x=0; x<3; x++) {
            summa = matr_a[y][x] + matr_b[y][x];

            if(x==2) {
                System.out.println(summa);
            } else {
                System.out.print(summa +"\t");
            } */

}
