package draft;

import java.util.Arrays;

public class Draftsort {
	static int[] swap(int[] array, int f_index, int t_index) {
		int temp = array[f_index];
		array[f_index] = array[t_index];
		array[t_index] = temp;
		return array;
	}

	public static void main(String[] args) {
		// defining an array with the random nombers
//		Random random = new Random();
//		random.nextInt(100);
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i + " random = " + random.nextInt(5, 11));
//		int[] array = new int[10];
//		for (int i = 0; i < 10; i++) {
//			array[i] = random.nextInt(100);
//		}
//		System.out.println(Arrays.toString(array));

//		int pivot = array[(array.length - 1)];
//		System.out.println(pivot);
//		int[] result = swap(array, 3, 5);
//		System.out.println(Arrays.toString(result));
//		int[] new_arr;
		int[] ex_array = { 5, 7, 3, 9, 4, 2, 6, 8, 1 };
//		int j = ex_array[(ex_array.length) - 2];
//		for (int i = 0; i < (ex_array.length); i++) {
//			if (ex_array[i] > ex_array[(ex_array.length) - 1]) {
//				while (j > 0) {
//					if (ex_array[j] < ex_array[(ex_array.length) - 1]) {
//						int[] new_arr = swap(ex_array, i, j);
//						break;
//					}
//					j--;
//				}
//			}
//		}
		System.out.println(Arrays.toString(ex_array));
		swap(ex_array, 3, 5);
//		int[] new_array = swap(ex_array, 3, 5);  
		System.out.println(Arrays.toString(ex_array));

	}

}
