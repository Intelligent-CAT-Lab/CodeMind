import java.util.Arrays;
import java.util.Scanner;

public class p03329 {
    static final int MAX_N = 110000;
    static int[] memo = new int[MAX_N];
    static {
        Arrays.fill(memo, -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calc(n);
        System.out.println(ans);
    }

    static int calc(int n) {
        if (n == 0) return 0;
        if (memo[n]!= -1) return memo[n];

        int res = n;
        for (int pow6 = 1; pow6 <= n; pow6 *= 6) {
            res = Math.min(res, calc(n - pow6) + 1);
        }
        for (int pow9 = 1; pow9 <= n; pow9 *= 9) {
            res = Math.min(res, calc(n - pow9) + 1);
        }
        memo[n] = res;
        return memo[n];
    }
}