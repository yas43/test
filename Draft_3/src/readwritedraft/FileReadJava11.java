package readwritedraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadJava11 {

	public static void main(String[] args) {
		/**
		 * using java11 tools : Files package, Uri package return a string data is
		 * stored in symptoms.txt
		 */
		Path path = Paths.get("symptoms.txt");
		try {
			String data = Files.readString(path);
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
