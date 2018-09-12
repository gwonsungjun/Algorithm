package codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for(int a : A){
            set.add(a);
        }

        for(int i=1; i < Integer.MAX_VALUE; i++){
            if( !set.contains(i)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int[] A = { 1, 3, 6, 4, 1, 2};
        // int[] A = { 1, 2, 3};
        // int[] A = {1, -1};
        // int[] A = {2};
        int[] A = {4, 5, 6, 2};

        System.out.print(">> result : " + solution(A));
    }
}