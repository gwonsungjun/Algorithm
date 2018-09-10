package codility;

import java.util.Arrays;

public class MissingInteger {

    public static int solution(int[] A) {

        int length = A.length;
        int[] sortedArray = Arrays.stream(A).sorted().distinct().toArray();
        int num = ((int) Arrays.stream(sortedArray).filter(i -> i < 0).count());
        int sum = Arrays.stream(sortedArray).sum();

        if (num == length) {
            return 1;
        } else if(length==1){
            return A[0]+1;
        }else {
            int s = (length * (length + 1) / 2) - sum;
            if (s == 0 || num > 0) {
                return sortedArray[length - 1] + 1;
            } else {
                for (int i = 0; i < length; i++) {
                    if (sortedArray[i] + 1 != sortedArray[i + 1])
                        return sortedArray[i] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       // int[] A = { 1, 3, 6, 4, 1, 2};
        // int[] A = { 1, 2, 3};
        //int[] A = {1, -1};
         int[] A = {2};
        System.out.print(">> result : " + solution(A));
    }
}
