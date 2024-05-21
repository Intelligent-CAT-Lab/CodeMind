import java.util.*;

public class p02715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long P = (long)Math.pow(10, 9) + 7;
        long[] X = new long[K+1];
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * pow(K/i, N, P);
        }
        System.out.println(ans % P);
    }

    public static long pow(long x, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * x % mod;
            }
            x = x * x % mod;
            n /= 2;
        }
        return res;
    }
}