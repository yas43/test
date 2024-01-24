package draft2;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class main {

	public static void main(String[] args) {
			String orginal_word = "quit";
			String input = "";
			
			
			
			while (!input.equalsIgnoreCase(orginal_word)) {
				System.out.println("program executing");
				System.out.println("program run");
				System.out.println("type quit for exiting proram or type any words for contniung");
				Scanner scanner = new Scanner(System.in);
				 input = scanner.next();
			}
			if(input.equalsIgnoreCase(orginal_word))
				System.out.println("exit pogram \n finished");
		
	
	}
}		