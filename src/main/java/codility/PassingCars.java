package codility;

public class PassingCars {


    public static int solution(int[] A){

        int length = A.length;
        int zeroCount = 0;
        int result = 0;

        for(int i=0; i < length; i++){
            if(A[i]==0){
                zeroCount++;
            }else{
                result+=zeroCount;
            }
        }

        if(result>1000000000) return -1;

        return result;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }
}
