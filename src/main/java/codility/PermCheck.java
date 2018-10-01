package codility;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

import java.util.Arrays;

import java.util.stream.IntStream;

public class PermCheck {

    //XOR???

    public static int solution(int[] A) {

        int max = IntStream.of(A).max().orElse(0);
        int length = (int)Arrays.stream(A).distinct().count();

        if(max==length && length == A.length){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
       // int[] A = {4, 1, 3, 2};
        int[] A = {1, 1};
        //int[] A = {4, 1, 3};
        //int[] A = {1};
        //int[] A = {1, 4, 1};

        System.out.println(solution(A));
    }
}

     /*   Arrays.sort(A);
                for (int i = 0; i < length-1; i++) {
        if (A[i + 1] != A[i] + 1) {
        return 0;
        }
        }

        return 1;*/


     /*
        int total = 0;
        int arraySum = 0;

        for(int i=1; i <= length; i++){
            total += i;
        }

        for(int i=0; i < length; i++){
            arraySum += A[i];
        }

        if(total-arraySum ==0){
            return 1;
        }else{
            return 0;
        }*/