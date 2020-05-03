package viikko_9;

import java.util.Scanner;

public class KysyJaTulosta {
    public void teeHommasi(String input) {
        Scanner reader = new Scanner(System.in);
        System.out.print(input);
        String inputAlt = reader.nextLine();
        System.out.println(inputAlt);
    }
}
