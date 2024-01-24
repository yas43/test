package exercise;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author yaser
 *
 */
public class Temp2 {
	// calculate the all the factors below sqrt of a given number
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static List<Integer> fac(int number) {
		List<Integer> list = new LinkedList<>();
		for (int i = 2; (i * i) <= number; i++) {
			int j = 0;
			while (number % i == 0) {
				int new_number = number / i;
				number = new_number;
				j++;
			}
			list.add(i);
			list.add(j);

		}
		System.out.println(list);
		return list;

	}

	// a method which detect all the number in the form of 6k+-1 below a given
	// number
	/**
	 * 
	 * @param number
	 */
	public static void detector(int number) {
		for (int i = 1; 6 * i - 1 < number; i++) {
			System.out.println("i= " + i + "  value= " + (6 * i - 1) + " and" + (6 * i + 1));
		}
	}

//		float root = (float) Math.sqrt(number);
//		DecimalFormat numberformat = new DecimalFormat("#.00");
//		System.out.println("for " + number + "  list is" + list + "  and root is " + numberformat.format(root));

	public static void main(String[] args) {
//		fac(3587);
//		fac(256);
//		List<Integer> my_list = new LinkedList<>();
//		my_list = fac(256);
//		for (int i = 0; i < my_list.size(); i += 2) {
//			System.out.println(Math.pow(my_list.get(i), my_list.get((i + 1))));
//		}
//		System.out.println(my_list);

		detector(21);

	}
}
