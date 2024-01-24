package pro_02_draft;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Draft_Tempo01 {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("symptoms.txt");
			BufferedInputStream input = new BufferedInputStream(file);
			int i = input.read();
			while (i != -1) {
				System.out.print((char) i);
				i = input.read();
			}
			input.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
