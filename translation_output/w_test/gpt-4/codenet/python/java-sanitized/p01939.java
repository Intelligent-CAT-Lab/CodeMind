import java.util.Scanner;

public class p01939 {
    private static final int MOD = 1000000007;

    private static long sum(int a, int d, int n) {
        return (long) n * (2 * a + (long) (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        long s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            s = sum(m + 1, -n + 1, 1 + m / (n - 1));
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }
}