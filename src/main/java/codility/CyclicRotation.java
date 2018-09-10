package codility;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {

        if (K > 0) {
            for (int j = 0; j < K; j++) {
                int bufferPrev = A[0];
                int bufferNext;
                for (int i = 0; i < A.length; i++) {
                    if (i == A.length - 1) {
                        A[0] = bufferPrev;
                        break;
                    }
                    bufferNext = A[i + 1];
                    A[i + 1] = bufferPrev;
                    bufferPrev = bufferNext;
                }
            }
        } else if (K < 0) {
            for (int j = 0; j > K; j--) {
                int bufferPrev = A[A.length - 1];
                int bufferNext;
                for (int i = A.length-1; i >= 0; i--) {
                    if (i == 0) {
                        A[A.length - 1] = bufferPrev;
                        break;
                    }
                    bufferNext = A[i - 1];
                    A[i - 1] = bufferPrev;
                    bufferPrev = bufferNext;
                }
            }
        } else {
            return A;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = -3;
        int[] result = solution(A, K);
        Arrays.stream(result).forEach(System.out::print);
    }
}



/*package codility;


        import java.util.Arrays;

public class Rotation {

    public static int[] solution(int[] A, int K) {
        int length = A.length;

        for (int i = 0; i < K; i++) {
            int pre = 0;
            int next;
            for (int j = 0; j < length; j++) {
                if (j == length - 1) {
                    A[0] = pre;
                    break;
                }
                next = A[j + 1];
                if (j == 0) {
                    A[j + 1] = A[j];
                } else {
                    A[j + 1] = pre;
                }
                pre = next;
            }
        }

        return A;

    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = solution(A, K);
        Arrays.stream(result).forEach(System.out::print);
    }
}*/
