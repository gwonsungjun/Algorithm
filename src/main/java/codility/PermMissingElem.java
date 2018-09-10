package codility;

import java.util.Arrays;

public class PermMissingElem {

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] + 1 != A[i + 1]) {
                return A[i] + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5};
        System.out.println(solution(array));
    }
}
