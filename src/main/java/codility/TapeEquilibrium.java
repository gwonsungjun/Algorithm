package codility;

public class TapeEquilibrium {

    public static int solution(int A[]) {

      int N = A.length;

        int sumTotal = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            sumTotal += A[i];
        }

        for (int i = 0; i < N-1; i++) {
            sumLeft += A[i];
            sumRight = sumTotal - sumLeft;
            result = Math.min(result, Math.abs(sumLeft-sumRight));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {-10, -20, -30, -40, 100};
        //int[] A = {3, 1, 2, 4, 3};
        System.out.print(solution(A));
    }
}

/*
    public static int solution(int A[]) {
        int N = A.length;

        if (N == 2) {
            return Math.abs(A[0] - A[1]);
        }

        int result = 0;
        int sumPrev = 0;

        for (int i = 0; i < N-1; i++) {
            sumPrev += A[i];
            int sumNext = 0;
            for (int j = i + 1; j < N; j++) {
                sumNext += A[j];
            }
            int abs = Math.abs(sumPrev - sumNext);
            if (i == 0) {
                result = abs;
            }
            if (abs < result) {
                result = abs;
            }
        }
        return result;
    }*/



