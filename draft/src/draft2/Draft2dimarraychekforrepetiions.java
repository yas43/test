package draft2;

import java.util.Arrays;

public class Draft2dimarraychekforrepetiions {

	public static void main(String[] args) {
		int k = 0;
		int[][] myarray = { { 3, 5, 5 }, { 10, 7, 6 }, { 0, 5, 8 }, { 5, 53, 5 } };
		System.out.println(Arrays.deepToString(myarray));
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				if (myarray[i][j] == 5) {
					k += 1;
				}

			}
			System.out.println(k);
		}

	}

}
