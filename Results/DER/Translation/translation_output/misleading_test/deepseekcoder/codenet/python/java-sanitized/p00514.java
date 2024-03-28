import java.util.Arrays;
import java.util.Scanner;

public class p00514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0], m = input[1], r = input[2];
        int a = Math.min(n-1, r-m*n);
        int b = Math.max(n-1, r-m*n);
        long d = factorial(a);
        long u = factorial(b+a) / factorial(b);
        System.out.println(a < 1 ? 0 : u / d);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}