package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {

    public static int solution(int N) {
        int longest = 0;
        List<Integer> list = new ArrayList<>();

        while (N > 0) {
            int na = N % 2;
            if (na == 0) {
                list.add(na);
            }
            N = N / 2;
        }
        list.add(N);

        Collections.reverse(list);


        return longest;
    }

    public static void main(String[] args) {
        int N = 1041;
        int result = solution(N);
        //System.out.println(result);
    }
}