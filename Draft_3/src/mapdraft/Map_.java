package mapdraft;

import java.util.HashMap;
import java.util.Map;

public class Map_ {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("iran", 98);
		map.put("usa", 10);
		map.put("german", 34);
		map.put("iceland", 53);
		map.put("france", 35);
		map.put("england", 44);
		for (int i = 0; i < 10; i++) {
			System.out.println(map);
		}
//		System.out.println(map.get("iran"));
//		System.out.println(map.containsKey("usa"));
//		System.out.println(map.containsValue(95));
//		System.out.println(map.size());
//		System.out.println(map.values());
//		System.out.println(map.keySet());
//		for (Integer code : map.values()) {
//			System.out.println(code);
//		}
//
//		for (String names : map.keySet()) {
//			System.out.println(names);
//		}

	}

}
