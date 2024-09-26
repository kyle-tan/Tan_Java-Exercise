package Tan_L6Activities;

public class Tan_L6Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Guitar is my favorite musical instrument";
		String[] sentenceArray = sentence.split(" ");
		String searchWord = "mus";
		
		Tan_L6Activity3 obj = new Tan_L6Activity3();
		
		System.out.println("Index: "+ obj.getIndex(sentenceArray, searchWord));
		
	}
	/**
	 * Function Name: getIndex
	 * Parameters: array of words in the sentence, search key
	 * 
	 * Inside the function:
	 * 	Loop that will check if a word has a prefix beginning with a searchKey
	 * 
	 * Returns:
	 * 	1. Index of the word whose prefix is the search key
	 * 	2. -1 if no word exist with a prefix equal to the search key
	 */
	public int getIndex(String[] words, String searchKey) {
		for (int x = 0; x < words.length; x++) {
			if(words[x].startsWith(searchKey))
				return x+1;
		}
		return -1;
	}
	
}
