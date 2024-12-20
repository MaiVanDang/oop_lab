package test6;
import java.util.Scanner;
public class Sum {
	public static void scanMatrix(int rows, int columns, int[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number columns: ");
		int columns = scanner.nextInt();
		
		int [][] matrixA = new int[rows][columns];
		int [][] matrixB = new int[rows][columns];
		int [][] result  = new int[rows][columns];
		
		System.out.println("Enter elements of the first matrix:");
		scanMatrix(rows,columns,matrixA);
		System.out.println("Enter elements of the second matrix:");
		scanMatrix(rows,columns,matrixB);
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
		
		System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " \t");
            }
            System.out.println();
        }
        
		scanner.close();
	}
}
