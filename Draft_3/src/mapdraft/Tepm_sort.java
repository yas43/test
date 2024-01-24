package mapdraft;

import java.util.Arrays;

public class Tepm_sort {

	static int[] my_sort(int[] list) {
		int[] my_list = new int[list.length];
		int pivot_num = list[(list.length) - 1];
		int k = 0;

		int j = list.length - 1;
		for (int i = 0; i < (list.length); i++) {
			if (list[i] > pivot_num) {
				my_list[j] = list[i];
				j--;
			}
			if (list[i] < pivot_num) {
				my_list[k] = list[i];
				k++;
			}
		}
		my_list[(k)] = pivot_num;
		return my_list;
	}

	public static void main(String[] args) {

		int[] list = { 7, 15, 14, 1, 9, 11, 0, 5, 10 };

		System.out.println(Arrays.toString(my_sort(list)));

	}
}
