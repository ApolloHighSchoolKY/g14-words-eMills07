import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<word>();
	}

	public Words(String s)
	{
		setWords(s);
	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"
			Scanner chopper = new Scanner(s);

		//Continue to loop while there are more words to read
		while(chopper.hasNext())
		{
			wordList.add(new Word(chopper.next()));
		}
			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
		for(Word word: wordList)
			{
				if(word.getLength() == size)
				count++;
			}

			//if the length of the "theWord" is the same as the parameter "size"

		return count;  //test
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;
		//for each Word in the ArrayList "words" loop
		for(Word word: words)
			if()
			{
				vowelCount++;
			}
			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"

			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "";
	}
}