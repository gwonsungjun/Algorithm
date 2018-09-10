package divideAndConquer;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Fence {

    static int fensHeights1[]= {7, 1, 5, 9, 6, 7, 3};

    public static void main(String[] args) {

        int tcCount = 3;
        int fensNum1= 7;
        int fensNum2= 7;
        int fensHeights2[]= {1, 4, 4, 4, 4, 1, 1};
        int fensNum3= 4;
        int fensHeights3[]= {1, 8, 2, 2};

        System.out.println(bruteForce(fensNum1, fensHeights1));
        System.out.println(bruteForce(fensNum2, fensHeights2));
        System.out.println(bruteForce(fensNum3, fensHeights3));
        System.out.println(solve(0, 6));
    }

    private static int bruteForce(int size, int input[]){
        int result = 0;

        for(int left = 0; left < size; left++){
            int minHeight = input[left];
            for(int right = left; right < size; right++){
                minHeight = min(minHeight, input[right]);
                result = max(result, (right-left+1) * minHeight);
            }
        }
        return result;
    }

    private static int solve(int left, int right){
        if(left==right) return fensHeights1[left];

        int half = (left+right) / 2;
        int result = max(solve(left, half), solve(half+1, right));

        int lo = half;
        int hi = half+1;
        int height = min(fensHeights1[lo], fensHeights1[hi]);
        result = max(result, height*2);

        while(left < lo || hi < right){
            if(hi < right && (lo == left || fensHeights1[lo-1] < fensHeights1[hi+1])){
                ++hi;
                height = min(height, fensHeights1[hi]);
            }else{
                --lo;
                height = min(height, fensHeights1[lo]);
            }
            result = max(result, height*(hi-lo+1));
        }
        return result;
    }
}
