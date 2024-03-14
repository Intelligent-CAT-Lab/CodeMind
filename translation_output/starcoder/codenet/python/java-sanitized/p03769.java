import java.util.*;
import java.io.*;

public class p03769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fact = new int[101];
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }
        int[] dp = new int[101];
        for (int i = 1; i <= 100; i++) {
            dp[i] = i;
        }
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j] * dp[i - j];
            }
        }
        int[] ans = new int[N + 1];
        int k = 1;
        for (int i = 1; i <= N; i++) {
            ans[i] = k;
            k += dp[i];
        }
        System.out.println(ans[N]);
        for (int i = 1; i <= N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}