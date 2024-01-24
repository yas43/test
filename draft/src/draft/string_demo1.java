package draft;

import java.util.Scanner;

public class string_demo1 {
//method for returning number of letters in a phrase
	static int lengthofstring(String phrase) {
		return phrase.length();
	}

//method for joining two phrase
	static String joining(String phrase1, String phrase2) {
		return phrase1.concat(phrase2);
	}

	public static void main(String[] arg) {
		int number_letters = lengthofstring("helloworl dd");
		System.out.println(number_letters);
		System.out.println("please enter the first phrase");
		// create an instance of scanner class for receiving user phrase
		Scanner usr_input = new Scanner(System.in);
		// receiving first phrase
		String phrase1 = usr_input.next();
		System.out.println("please enter phrase2");
		// receiving second phrase
		String phrase2 = usr_input.next();
		// calling method for joining two phrases
		String join_phrase = joining(phrase1, phrase2);
		System.out.println(join_phrase);
		usr_input.close();
	}

}
