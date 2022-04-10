// vowel counting a string "Luke"
// by Kristopher Smolarek (CSC250)

// Program in file luke_string.java
public class luke_string
{
	public static void main(String[] args)
	{
		String word = "Luke";
		// set count = 0 for indexing String word
		int count = 0;
		// loop through String word, index +1 each time
		for (int i = 0; i < word.length(); i++)
		{
			// Use OR operator to check for instances of vowels
			if (word.charAt(i) == 'a'
				|| word.charAt(i) == 'A'
				|| word.charAt(i) == 'e'
				|| word.charAt(i) == 'E'
				|| word.charAt(i) == 'i'
				|| word.charAt(i) == 'I'
				|| word.charAt(i) == 'o'
				|| word.charAt(i) == 'O'
				|| word.charAt(i) == 'u'
				|| word.charAt(i) == 'U')
					{
						// +1, total vowel counter
						count++;
					}
	}
		System.out.println("total vowels = " + count);
	}
}