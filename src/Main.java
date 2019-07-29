import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of matrix's row: ");
        int row = input.nextInt();
        System.out.print("Enter number of matrix's column: ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Max of the matrix is: "+findMax2DArray(matrix));
    }

    public static int findMax2DArray(int[][] arr) {
        int max = arr[0][0];
        int row1 = arr.length;
        int column1 = arr[0].length;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }

            }
        }
        return max;
    }

}