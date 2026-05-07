import java.util.Arrays;
import Solver.Solver;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int x=0;

        for(int[] row:matrix) Arrays.fill(row,x);
        matrix = Solver.Solve(matrix);
        for (int[] array: matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}
