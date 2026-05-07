package Solver;

public class Solver {
    public static int[][] Solve(int[][] matrix) {
        matrix[0][0] = matrix[0][1] = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && (j == 0 || j == 1)) continue;
                for (int k = 1; k < 3; k++) {
                    if (j - k < 0) {
                        matrix[i][j] += matrix[i - 1][j - k + matrix[0].length];
                    }
                    else {
                        matrix[i][j] += matrix[i][j - k];
                    }
                }
            }
        }
        return matrix;
    }
}
