package harjoituksia6;

public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};
		
		int i = 0;
		for (i = 0; i < peltipoliisi.length; i++) {
			String kokonainen1 = peltipoliisi[i];
			String [] splitattu = kokonainen1.split("-");
			
			String osa1 = splitattu[0];
			String osa2 = splitattu[1];
			
			String [] splitattu2 = osa2.split(";"); // jos splittiä, niin tee siitä [] array, lista.
			int nopeus = Integer.parseInt(splitattu2[1]);
			//String splitattu =
			
			if (nopeus >= 84) {
				System.out.println(kokonainen1.split(";")[0] + " " + nopeus); // kaikki yhteen.
				
			}
			
			//System.out.println(osa1 + " " + nopeus);
		}
	}

}
