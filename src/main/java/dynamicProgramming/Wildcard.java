package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Wildcard {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        String pattern;
        String[] inputs;
        int n;

        for (int i = 0; i < num; i++) {
            pattern = in.next().trim();
            n = in.nextInt();
            inputs = new String[n];
            for (int j = 0; j < n; j++) {
                inputs[j] = in.next().trim();
            }

            List<String> result = solve(pattern, inputs);
            if (result == null) {
                System.out.println("need a question mark or an Asta wildcard");
            } else {
                result.forEach(System.out::println);
            }
        }
    }

    private static List<String> solve(String pattern, String[] inputs) {
        List<String> list = new ArrayList<>();

        if (pattern.contains("?")) {
            int num = pattern.length();
            char[] patterns = new char[num];
            int pow = 0;
            for (int i = 0; i < num; i++) {
                patterns[i] = pattern.charAt(i);
                if (patterns[i] == '?') {
                    pow = i;
                }
            }

            for (int j = 0; j < inputs.length; j++) {
                int number = 0;
                int size = inputs[j].length();
                if (num != size) continue;
                char[] input = new char[size];
                for (int k = 0; k < size; k++) {
                    input[k] = inputs[j].charAt(k);
                    if (k == pow) continue;
                    if (patterns[k] == input[k]) {
                        number++;
                    }
                }
                if (size - 1 == number) {
                    list.add(inputs[j]);
                }
            }
        } else if (pattern.contains("*")) {
            String makedPattern = pattern.replaceAll("[*]", " ").trim();
            List<String> result = Arrays.stream(inputs).filter(d -> d.contains(makedPattern)).collect(Collectors.toList());
            list.addAll(result);

        } else {
            return null;
        }

        return list;
    }
}
