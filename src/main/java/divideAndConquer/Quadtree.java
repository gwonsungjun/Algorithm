package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class Quadtree {
    private static int count = 4;
    private static int maxCount = count * count;
    private static char[][] decompressed = new char[maxCount][maxCount];
    private static String result;
    private static int i = 0;

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("w");
        list.add("xbwwb");
        list.add("xbwxwbbwb");
        list.add("xxwwwbxwxwbbbwwxxxwwbbbwwwwbb");

        list.forEach(p -> {
            System.out.println(decompress(p, 0, 0, maxCount));
            decompressed = new char[maxCount][maxCount];
            result = null;
            i = 0;
        });
    }

    private static String decompress(String input, int y, int x, int size) {
        int inputLength = input.length();
        if(i==inputLength){
            return result;
        }

        char head = input.charAt(i);
        if (Character.toString(head).equals("b") || Character.toString(head).equals("w")) {
            for (int dy = 0; dy < size; dy++) {
                for (int dx = 0; dx < size; dx++) {
                    decompressed[y + dy][x + dx] = head;
                }
            }
            result = Character.toString(head);

        } else {
            int half = size / 2;
            i++;
            String upperLeft = decompress(input, y, x, half);
            i++;
            String upperRight = decompress(input, y, x + half, half);
            i++;
            String lowerLeft = decompress(input, y + half, x, half);
            i++;
            String lowerRight = decompress(input, y + half, x + half, half);

            result = "x" + lowerLeft + lowerRight + upperLeft + upperRight;
        }
        return result;
    }

}