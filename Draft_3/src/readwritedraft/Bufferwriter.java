package readwritedraft;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferwriter {
	public static void main(String[] ags) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("this is first text for test");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
