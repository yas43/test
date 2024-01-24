package readwritedraft;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bufferedinputstream {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("test.txt");
			BufferedInputStream input = new BufferedInputStream(file);
			int i = input.read();
			while (i != -1) {
				System.out.print((char) i);
				i = input.read();
			}
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
