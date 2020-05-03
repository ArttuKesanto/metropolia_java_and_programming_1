package harjoittelua;
import java.util.Scanner;
public class Cooper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna juostu matka: ");
		int matkaj = reader.nextInt();
		
		int kokonaiskierros = matkaj / 400;
		
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + kokonaiskierros);
		

	}

}
