package package_2;

import java.util.HashMap;
import java.util.Map;

//   Given a roman numeral, convert it to an integer

public class Excer_5 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(8, "VIII");
		map.put(7, "VII");
		map.put(6, "VI");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(3, "III");
		map.put(2, "II");
		map.put(1, "I");
		System.out.println(map);

		map.put(100, "C");
		map.put(8, "VIII");
		map.put(7, "VII");
		map.put(6, "VI");
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(3, "III");
		map.put(2, "II");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(1, "I");
		System.out.println(map);

	}

}
