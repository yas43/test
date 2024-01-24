package pro_02_draft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Draft_Tempo02 {

	public static void main(String[] args) {
//		try {
//			FileInputStream file = new FileInputStream("symptoms.txt");
//			BufferedInputStream input = new BufferedInputStream(file);
//			int i = input.read();
//			while (i != -1) {
//				System.out.print((char) i);
//				i = input.read();
//			}
//			input.close();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		String message = "i am yaser and this is a test message";
//		List<String> message_list = new LinkedList<>();
//		String[] array = message.split("");
//		System.out.println(Arrays.toString(array));
		Path path = Path.of("symptoms.txt");
		try {
//			String msg_read = Files.readString(path);
//			System.out.println(msg_read);

			List<String> list = Files.readAllLines(path);
			System.out.println(list);

			Set<String> set = new HashSet<>();
			Map<String, Integer> map = new HashMap<>();
			set.addAll(list);
			System.out.println(set);
			int increament = 0;
			for (String symptoms : set) {
				for (int j = 0; j < list.size(); j++) {
					if (j == list.size() - 1) {
						map.put(symptoms, increament);
						increament = 0;
					}
					if (symptoms.equals(list.get(j))) {
						increament++;
					}
				}

			}
			System.out.println(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
