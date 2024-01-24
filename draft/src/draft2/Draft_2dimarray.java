package draft2;

import java.util.Arrays;

public class Draft_2dimarray {

	static int[][] makeArray() {
		int[][] array = new int[5][3];
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 2; j++) {
				array[i][j] = i * i + j;
			}
		}
		return array;
//		System.out.println(i);
	}

	public static void main(String[] args) {
		int[][] my_array = makeArray();

		System.out.println(Arrays.deepToString(my_array));

	}

}
