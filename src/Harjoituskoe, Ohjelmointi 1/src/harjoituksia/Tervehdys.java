package harjoituksia;
import java.util.Scanner;
import java.util.regex.*;

public class Tervehdys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		
		while (true) {
		System.out.print("Mitä kello on? Anna tunnit: ");
		int hours = reader.nextInt();
		
		
		if (!(hours < 24 && hours > 0)) {
			System.out.println("Kellonaika on erikoinen. Anna uudestaan välillä 0-23. \n");
			continue;
		}
			else {
				
				if (hours >= 7 && hours < 10 ) {
					System.out.println("Hyvää huomenta!");
					break;
				}
				
				else if (hours >= 10 && hours < 17) {
					System.out.println("Hyvää päivää!");
					break;
				}
				
				else if (hours >= 17 && hours < 22) {
					System.out.println("Hyvää iltaa!");
					break;
				
				}
				
				else  {
				//(hours >= 22 && hours < 7) {
					System.out.println("Hyvää yötä!");
					break;
				}
			}

	}
			reader.close();
	}
	}
