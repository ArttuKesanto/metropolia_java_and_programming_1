package viikko_7;

import java.io.*;

public class PieninSuurin {
    public static void main(String[] args) {
        int luku1, luku2, luku3, suurin, pienin;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            luku1 = Integer.parseInt(in.readLine());

            System.out.print("Syötä toinen kokonaisluku: ");
            luku2 = Integer.parseInt(in.readLine());

            System.out.print("Syötä kolmas kokonaisluku: ");
            luku3 = Integer.parseInt(in.readLine());

            suurin = suurin(luku1, luku2, luku3);
            pienin = pienin(luku1, luku2, luku3);

            System.out.print("Syöttämistäsi luvuista suurin oli " + suurin);
            System.out.print(" ja pienin " + pienin + "\n");
        } catch (Exception e) {
            System.out.print("Antamasi syöte on virheellinen...");
        }
    }


    public static int suurin(int first, int second, int third) {
        int start = first;

        if (second > first) {
            start = second;
            if (third > second) {
                start = third;
            }
        } else if (third > first) {
            start = third;
        } else {
            return start;
        }
        return start;
    }

    public static int pienin(int first, int second, int third) {
        int startSmallest = first;

        if (second < first) {
            startSmallest = second;
            if (third < second) {
                startSmallest = third;
            }
        } else if (third < first) {
            startSmallest = third;
        } else {
            return startSmallest;
        }
        return startSmallest;
    }

}

