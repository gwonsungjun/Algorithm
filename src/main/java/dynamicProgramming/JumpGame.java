package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class JumpGame {

    // 2 5 1 6 1 4 1 6 1 1 2 2 9 3 7 2 3 2 1 3 1 1 1 3 1 7 1 2 4 1 2 3 4 1 2 3 3 1 2 3 4 1 1 5 2 9 4 7 1
    // 2 5 1 6 1 4 1 6 1 1 2 2 9 3 7 2 3 2 1 3 1 1 1 3 1 7 1 2 4 1 2 3 4 1 3 3 3 1 2 3 4 1 1 5 2 9 4 7 1

    int[][] matrix;
    int[][] cache;
    int n;

    JumpGame(int[][] inputMatrix){
        n = inputMatrix.length;
        this.matrix = inputMatrix;

        cache = new int[n][n];
        Arrays.stream(cache).forEach(i -> Arrays.fill(i, -1));
    }

    public boolean solve(int x, int y){

        if(y >= n || x >= n) return false;
        if(y == n-1 && x == n-1) return true;

        if(cache[x][y] == 1) return false;
        else cache[x][y] = 1;

        int jumpSize = matrix[x][y];
        return solve(x, y+jumpSize) || solve(x+jumpSize, y);
    }


    public static void main(String[] args) {

        int[][] matrix = null;
        int n;

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int x = 0; x < num; x++) {
            n = in.nextInt();
            matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
        }

        JumpGame jumpGame = new JumpGame(matrix);
        boolean result = jumpGame.solve(0,0 );
        System.out.print(result == true ? "yes" : "no");
    }

}