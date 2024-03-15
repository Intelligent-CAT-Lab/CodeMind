import java.util.Scanner;

public class atcoder_AGC025_A {
    private static final int INF = Integer.MAX_VALUE;
    private static final int mod = 1000000007; // 10**9 + 7

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }
        System.out.println(ans);

        sc.close();
    }

    private static int dsum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10; // Add last digit to sum
            x /= 10;       // Remove the last digit
        }
        return sum;
    }
}