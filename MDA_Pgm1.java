package Multi_Dimensional_Array.org;

import java.util.Iterator;

public class MDA_Pgm1 {

	public static void main(String[] args) {
		
		int rows = 3, columns = 5;
		int a[][] = new int [rows][columns];
		
		int value = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();			
		}
	}

}
