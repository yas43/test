package readwritedraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadJava8 {

	public static void main(String[] args) {
		/**
		 * using java8 tools:File package Path package return a list
		 */
		Path path = Paths.get("test.txt");
		try {
			List<String> data = Files.readAllLines(path);
			System.out.println(data);

			// convert list to a sting
//			String message = String.join(System.lineSeparator(), data);
//			System.out.println(message);

			System.out.println("size of list is :  " + data.size());
			for (String members : data) {
				System.out.println(members);

			}
			/**
			 * return an array by using Files.readAllBytes
			 */

//			String arraytostring = new String(Files.readAllBytes(path));
//			System.out.println(arraytostring);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
