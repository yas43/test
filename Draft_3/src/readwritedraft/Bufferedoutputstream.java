package readwritedraft;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferedoutputstream {

	public static void main(String[] args) {
		String message = "this is a test for bufferedoutput in gisele file";
		try {
			FileOutputStream writer = new FileOutputStream("gisele.txt");
			BufferedOutputStream output = new BufferedOutputStream(writer);
			byte[] array = message.getBytes();
			output.write(array);
			output.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
