package readwritedraft;

import java.io.FileInputStream;

public class FileInputStreams {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("yaser.txt");
			int i;
			while ((i = input.read()) != -1) {
				System.out.print((char) i);
			}
			input.close();

		} catch (Exception e) {

		}

	}

}
