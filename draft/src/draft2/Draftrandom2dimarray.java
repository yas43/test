package draft2;

import java.util.Random;

//create a array (given raws and column ) by random numbers between 0_10

public class Draftrandom2dimarray {
	static int randombetween0_10() {
		double number = Math.random();
		return (int) (10 * number);
	}

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
		int number;
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			number = random.nextInt(1, 7);

			System.out.println(i + "  time =  " + number);
		}
//		for (int i = 0; i < 5; i++) {
//			int[][] myarray = randomArray(3, 2);
//			System.out.println(Arrays.deepToString(myarray));
//		}
	}

}
