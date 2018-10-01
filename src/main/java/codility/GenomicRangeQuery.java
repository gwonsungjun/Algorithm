package codility;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q) {

        int length = P.length;
        char[] chars = S.toCharArray();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int pVal = P[i];
            int qVal = Q[i];

            result[i] = getMinVal(pVal, qVal, chars);
        }

        return result;
    }

    private static int getMinVal(int pVal, int qVal, char[] chars) {

        int minVal = Integer.MAX_VALUE;
        for(int i = pVal; i <= qVal; i++) {
            minVal = Math.min(minVal, stringToInt(String.valueOf(chars[i])));
        }

        return minVal;
    }

    private static int stringToInt(String val) {
        if (val.equals("A")) {
            return 1;
        } else if (val.equals("C")) {
            return 2;
        } else if (val.equals("G")) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int P[] = {2, 5, 0};
        int Q[] = {4, 5, 6};
        Arrays.stream(solution(S, P, Q)).forEach(System.out::print);
    }
}
