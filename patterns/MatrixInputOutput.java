import java.util.Scanner;

public class MatrixInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        // Input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
