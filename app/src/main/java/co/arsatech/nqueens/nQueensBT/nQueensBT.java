package co.arsatech.nqueens.nQueensBT;

public class nQueensBT {

    int[] col;
    int[][] solutions;
    int numberOfSolutions;

    public nQueensBT(int n) {
        col = new int[n + 1];
        solutions = new int[1000][n];
        numberOfSolutions = 0;
        SolveNQueens(n, 0);
    }

    public int getNumberOfSolutions() {
        return numberOfSolutions;
    }

    public int[][] getSolution() {
        return solutions;
    }

    void SolveNQueens(int n, int i) {
        int j;
        if (Promising(i)) {
            if (i == n) {
                System.arraycopy(col, 1, solutions[numberOfSolutions], 0, n);
                // line above is equal to lines below
//                for (int m = 0; m < n; m++)
//                    solutions[numberOfSolutions][m] = col[m + 1];
                numberOfSolutions++;
            } else {
                for (j = 1; j <= n; j++) {
                    col[i + 1] = j;
                    SolveNQueens(n, i + 1);
                }
            }
        }
    }

    boolean Promising(int i) {
        int k;
        boolean _switch;
        k = 1;
        _switch = true;
        while (k < i && _switch) {
            if (col[i] == col[k] || Math.abs(col[i] - col[k]) == i - k)
                _switch = false;
            k++;
        }
        return _switch;
    }
}
