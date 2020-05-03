package harjoituksia;

import java.util.Scanner;
import java.util.ArrayList;

public class HakuListalta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wordList = new ArrayList<String>();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		
		Scanner reader = new Scanner(System.in);
		
		int i = 0;
		while (i < 5) {
			System.out.print("Kirjoita sana " + (i + 1) + "/5: ");
			String word = reader.next();
			wordList.add(word.toLowerCase());
			i++;
	}
			System.out.println("");
			System.out.print("Anna etsittävä termi: ");
			String searchable1 = reader.next();
			String searchable = searchable1.toLowerCase();
			int timesFound = 0;
			
			for (int index = 0; index < wordList.size(); index++) {
				
				String wordAtHand = wordList.get(index);
				int found = wordAtHand.indexOf(searchable);
				
				if (!(found == -1)) {
					System.out.println("Löytyi");
					timesFound++;
					indexes.add(index);
				}
				
				else {
					System.out.println("Ei löytynyt osumia.");
					continue;
				}
				
			}
			System.out.println("");
			System.out.println("Löytyi " + timesFound + " osumaa:");
			for (int indexesForAnotherList : indexes) {
				System.out.println(wordList.get(indexesForAnotherList));
			}

}
}
