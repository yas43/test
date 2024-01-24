package package_2;

//given an array and integer . return indices of two number such that add up to target 

public class Excer_2 {

	public static void main(String[] args) {
		int[] array = { 19, 9, 1, 5, 3, 7, 11, 23, 43, 17, 13, 27 };
		int target = 44;
		for (int i = 0; i < (array.length); i++) {
			for (int j = i; j < (array.length); j++)
				if (array[i] + array[j] == target) {
					System.out.println(array[i] + "   and   " + array[j]);
					System.out.println("find it");
				}

		}

	}

}
