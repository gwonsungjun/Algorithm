package codility;

import java.util.Arrays;

public class TapeEquilibrium {

    public static int solution(int A[]) {
        int N = A.length;
        int result = 0;
        int sumPrev = 0;
        for (int i = 0; i < N; i++) {
            sumPrev += A[i];
            int sumNext = 0;
            for (int j = i+1; j < N; j++){
                sumNext += A[j];
            }
            int abs = Math.abs(sumNext-sumPrev);
            if (i==0){
                result = abs;
                continue;
            }
            if(abs < result){
                result = abs;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.print(solution(A));
    }
}
