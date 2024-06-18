import java.util.HashSet;
import java.util.Scanner;

public class twoD_Matrix_Dup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        HashSet<Integer> uniqueValues = new HashSet<>();

        boolean flagg = true;

        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value =0;
                flagg = true;
                while (flagg) {
                    System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                    value = scanner.nextInt();
                    if (!uniqueValues.contains(value)) {
                        uniqueValues.add(value);
                        flagg = false;
                    } else {
                        System.out.println("Value already exists. Enter a different value.");
                    }
                }
                matrix[i][j] = value;
            }
        }

        System.out.println("The 2D matrix with unique values is:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
