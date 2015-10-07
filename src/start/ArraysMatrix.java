package start;

/**
 * Created by Maksim_Palchevskii on 9/16/2015.
 */
public class ArraysMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i+j == 9 || i == j) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( matrix[i][j] == 1 ) {
                    System.out.print(matrix[i][j] + "   ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.print("\n");
        }
    }
}
