package readwritedraft;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreams {

	public static void main(String[] args) {
		try {
			OutputStream pen = new FileOutputStream("matin.txt");
			byte[] my_array = new byte[100];
			String message = "this is test for matin in first step and it is just starting";
			my_array = message.getBytes();

			pen.write(my_array);
			pen.close();

		} catch (Exception e) {

		}

	}

}
