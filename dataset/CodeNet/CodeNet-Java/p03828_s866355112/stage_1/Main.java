import java.util.Scanner;

public class Main {
    static int n;
    static int mod = 1000000007;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n+1];
        for (int i = 1; i < n; i++) {
            primeFactorize(i);
        }
        primeFactorize(n);

        long count = 1;
        for (int i = 0; i <= n; i++) {
            if (dp[i] != 0) {
                count = count%mod * (dp[i] + 1)%mod;
            }
        }
        System.out.println(count);
    }
    //素因数分解し、素因数を配列に格納する。
    static void primeFactorize(int num) {
        for (int i = 2; i <= num; i++) {
        if (num % i != 0) continue;
        dp[i]++;
        primeFactorize(num/i);
        break;
        }
    }
}
