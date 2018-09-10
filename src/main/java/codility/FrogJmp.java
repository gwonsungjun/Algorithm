package codility;

public class FrogJmp {

    public static int solution(int X, int Y, int D){
        int sum;
        int count = 0;

        if(X+D < Y) {
            sum = X+D;
            count = 1;
        }else{
            return count;
        }

        while(sum < Y){
            sum+=D;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        System.out.print(solution(10, 85, 30));
    }
}
