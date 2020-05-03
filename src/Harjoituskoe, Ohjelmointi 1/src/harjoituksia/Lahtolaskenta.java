package harjoituksia;

public class Lahtolaskenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		
		while (i > 0) {
			if ( (i % 3) == 0) {
				i = i - 1;
				continue;
			}
			
			else {
				System.out.println(i);
				i--;
			}
			//i--;
		}
	}

}
