import java.util.Scanner;

public class p03544 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fib(N + 1));
        scanner.close();
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[n];
        memo[0] = 2;
        if (n > 1) {
            memo[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }
}