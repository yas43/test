package draft2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//create a r	random  number between 0_10
public class Draft10006 {
	static int randombetween0_10() {
		double number = Math.random();
		return (int) (10 * number);
	}

// create a array by given raws and column	
	static int[][] randomArray(int raw, int column) {
		int[][] array = new int[raw][column];
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = randombetween0_10();
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// define a list in order to keep the repetitive element including a counter and
		// a target
		List<Integer> list = new ArrayList<>();
		int counter = 0;
		int target = 5;
		// defining an arrays and rows and columns for arrays
		int row = 3;
		int column = 3;
		int[][] array = new int[row][column];

		// initializing array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = randombetween0_10();
			}
		}

//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				if (array[i][j] == target) {
//					while (i <= row && j < column && array[i][j] == target) {
//						counter = +1;
//
//					}
//					list.add(j);
//					System.out.println(list);
//					counter = 0;
//				}
//			}
//
//		}

		int[][] my_arrays = array;
		System.out.println(Arrays.deepToString(my_arrays));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == target) {
					while (i <= row && j < column && array[i][j] == target) {
						counter = +1;

					}
					list.add(j);
					System.out.println(list);
					counter = 0;
				}
			}

		}

	}

}
