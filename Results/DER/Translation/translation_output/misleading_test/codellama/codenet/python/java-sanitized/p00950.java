import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class p00950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = solve(input);
        System.out.println(result);
    }

    private static int solve(String input) {
        int result = 0;
        char[] base = "=+-*()01".toCharArray();
        int l = input.length();
        int[] mapping = new int[256];
        int[] counter = new int[256];
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char c = input.charAt(i);
            if (c == '=') {
                result++;
            } else if (c == '+') {
                result++;
            } else if (c == '-') {
                result++;
            } else if (c == '*') {
                result++;
            } else if (c == '(') {
                result++;
            } else if (c == ')') {
                result++;
            } else if (c == '0') {
                result++;
            } else if (c == '1') {
                result++;
            } else {
                result++;
            }
        }
        return result;
    }
}