package draft2;

class Cell {
	int x;
	int y;
	int[][] array = { { 1, 0, 1 }, { 0, 1, 1 }, { 1, 0, 0 } };

	boolean isFree(int x, int y) {
		this.x = x;
		this.y = y;
		if (array[x][y] == 0)
			return false;
		else
			return true;

	}
}

class Point {
	int x;
	int y;
	int value;
}

public class Draw {

	public static void main(String[] args) {
		// int[][] myarray = { { 1, 5 }, { 2, 10 }, { 9, 17 } };
		// System.out.println(Arrays.deepToString(myarray));
		// System.out.println(myarray[1][1]);
		Cell cell = new Cell();
		// cell.x=1;
		// cell.y=1;
		System.out.println(cell.isFree(0, 1));

	}

}
