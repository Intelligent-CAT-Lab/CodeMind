import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class p01829 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int number = Integer.parseInt(input);
        int max = Integer.MAX_VALUE;
        int result = 0;
        int ten = (int) Math.pow(10, length);
        for (int[] a : permutations(length)) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(number - b), ten - Math.abs(number - b));
            if (max > tm) {
                max = tm;
                result = a;
            }
        }
        System.out.println(result);
    }

    public static int[][] permutations(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = j;
            }
        }
        return result;
    }
}