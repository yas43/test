package readwritedraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadReturnStream {

	public static void main(String[] args) {
		Path path = Paths.get("symptoms.txt");
		try {
			Stream<String> file = Files.lines(path);
			Stream<String> unique_list = file.distinct();
//			System.out.println(file);
			unique_list.forEach(t -> System.out.println(t));
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
