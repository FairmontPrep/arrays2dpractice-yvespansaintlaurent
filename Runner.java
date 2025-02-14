
public class Runner {

	public static boolean ROW = true;
	public static boolean COLUMN = false;
	
	public static void main(String[] args) {
		
		Array two = new Array();
		
		int[][] b = two.getRowMajorSquare(4);
		
	
		System.out.println("This program only reports what you have; it does not say whether or not it is correct.");
		System.out.println("Please check your answers with the documentation.");
		System.out.println("Printing getRowMajorSquare(4)");
		System.out.println("You should see a 4x4 array starting at 1 and ending at 16, with 1 2 3 4 in the first row.");
		testArray(b, 1, ROW);
		two.printDouble(b);
		System.out.println();
		
		System.out.println("Printing getRowMajorSquare(6)");
		System.out.println("You should see a 6x6 array starting at 1 and ending at 36, with 1 2 3 4 5 6 in the first row.");
		b = two.getRowMajorSquare(6);
		testArray(b, 2, ROW);
		two.printDouble(b);
		System.out.println();
		
		System.out.println("Printing getRowMajorSquare(9)");
		System.out.println("You should see a 9x9 array starting at 1 and ending at 81, with 1 2 3 4 5 6 7 8 9 in the first row.");
		b = two.getRowMajorSquare(9);
		testArray(b, 3, ROW);
		two.printDouble(b);
		System.out.println();
		
		
		System.out.println("Printing getColumnMajorSquare(3)");
		System.out.println("You should see a 3x3 array starting at 1 and ending at 9, with 1 4 7 in the first row.");
		int[][] c = two.getColumnMajorSquare(3);
		
		
		testArray(c, 4, COLUMN);
		two.printDouble(c);
		System.out.println();
		
		System.out.println("Printing getColumnMajorSquare(5)");
		System.out.println("You should see a 5x5 array starting at 1 and ending at 25, with 1 6 11 16 21 in the first row.");
		c = two.getColumnMajorSquare(5);
		testArray(c, 5, COLUMN);
		two.printDouble(c);
		System.out.println();
		
		System.out.println("Printing getColumnMajorSquare(8)");
		System.out.println("You should see a 3x3 array starting at 1 and ending at 64, with 1 9 17 25 33 41 49 57 in the first row.");
		c = two.getColumnMajorSquare(8);
		testArray(c, 6, COLUMN);
		two.printDouble(c);
		System.out.println();
		
		System.out.println("Printing getRowMajorRectangle(3, 5)");
		System.out.println("You should see a 3x5 array starting at 1 and ending at 15, with 1 2 3 4 5 in the first row.");
		int[][] d = two.getRowMajorRectangle(3, 5);
		
		testArray(d, 7, ROW);
		two.printDouble(d);
		System.out.println();
		
		System.out.println("Printing getRowMajorRectangle(5, 7)");
		System.out.println("You should see a 5x7 array starting at 1 and ending at 35, with 1 2 3 4 5 6 7 in the first row.");
		d = two.getRowMajorRectangle(5, 7);
		testArray(d, 8, ROW);
		two.printDouble(d);
		System.out.println();
		
		System.out.println("Printing getColumnMajorRectangle(6, 4)");
		System.out.println("You should see a 4x6 array starting at 1 and ending at 24, with 1 5 9 13 17 21 in the first row.");
		int[][] e = two.getColumnMajorRectangle(6, 4);
		
		testArray(e, 9, COLUMN);
		two.printDouble(e);
		System.out.println();
		
		System.out.println("Printing getRowMajorRectangle(8, 7)");
		System.out.println("You should see a 8x7 array starting at 1 and ending at 56, with 1 2 3 4 5 6 7 in the first row.");
		e = two.getRowMajorRectangle(8, 7);
		testArray(e, 10, ROW);
		two.printDouble(e);
		System.out.println();
		
	}

	public static void testArray(int[][] testArr, int testNum, boolean rowMajor)
	{
		int row = testArr.length;
		int col = testArr[0].length;
		
		System.out.print("Test " + testNum + " : Array has " + row + " rows and " + col + " columns in ");
		System.out.println((rowMajor ? "Row Major" : "Column Major") + " order");
		System.out.print("The first row starts with " + testArr[0][0]);
		System.out.println(" and ends with " + testArr[0][col-1]);
		System.out.print("The last row starts with " + testArr[row-1][0]);
		System.out.println (" and ends with " + testArr[row-1][col-1]);

	}
}