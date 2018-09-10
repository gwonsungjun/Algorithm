package codility;

import java.util.Arrays;

public class PermCheck {

    public static int solution(int[] A) {
        int length = A.length;

        Arrays.sort(A);

        for (int i = 0; i < length-1; i++) {
            if (A[i + 1] != A[i] + 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        //int[] A = {4, 1, 3, 2};
        //int[] A = {1, 1};
        //int[] A = {4, 1, 3};
        //int[] A = {-1, -2};
        int[] A = {1};
        System.out.println(solution(A));
    }
}
