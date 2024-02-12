package Multi_Dimensional_Array.org;

public class MDA_Simple_Pgm {

	public static void main(String[] args) {
		int row = 2;
		int column = 3;
		int a[][] = new int[row][column];

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
