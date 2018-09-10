package codility;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {

        int length = A.length;
        int result;

        for (int i = 0; i < length; i++) {
            if (A[i] == X && i + 1 >= X) {
                result = i;
                return result;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int X = 5;
        int[] A = {1, 2, 3, 5, 3, 1};
        System.out.println(solution(X, A));
    }
}