package codility;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {


        int length = A.length;
        int[] counters = new int[N];
        int max = 0;

        for (int i = 0; i < length; i++) {
            int val = A[i];
            if (1 <= val && val <= N) {
                counters[val - 1] += 1;
                max = Math.max(max, counters[val - 1]);
            } else if (val == N + 1)  {
                Arrays.fill(counters, max);
            }
        }

        return counters;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(N, A);

        Arrays.stream(result).forEach(System.out::print);


        System.out.println(args);
        System.out.println(args);
    }
}



/*

    int length = A.length;
    int[] counter = new int[N];
        Arrays.fill(counter, 0);

                for (int i = 0; i < length; i++) {
        int val = A[i];
        if (1 <= val && val <= N) {
        counter[val - 1] += 1;
        } else if (val == N + 1) {
        int num = getMaxVal(counter);
        Arrays.fill(counter, num);
        }
        }

        return counter;
        }

public static int getMaxVal(int[] counter) {
        int length = counter.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
        if (counter[i] > max) {
        max = counter[i];
        }
        }
        return max;
*/

