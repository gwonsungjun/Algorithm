package codility;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        int[] B = IntStream.of(A).distinct().toArray();
        return (B.length != X) ? -1 : Arrays.stream(A)
                                                    .boxed()
                                                    .collect(Collectors.toList())
                                                    .indexOf(B[B.length-1]);
    }

    public static void main(String[] args) {
        int X = 3;
        /*int[] A = {1, 2, 3, 5, 3, 1};*/
        /*int[] A = {2, 2, 2, 2, 2, 2};*/
        /*int[] A = {1, 3, 1, 4, 2, 3, 5, 4};*/
        int[] A = {1, 3, 1, 3, 2, 1, 3};
        System.out.println(solution(X, A));
    }
}