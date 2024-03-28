import java.util.*;
import java.io.*;

public class p03365 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] fact = new int[n+1];
        int[] ifact = new int[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % 1000000007;
            ifact[i] = pow(fact[i], 1000000007-2, 1000000007);
        }
        int ans = 0;
        int c0 = 0;
        for (int i = n/2; i <= n; i++) {
            int c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + 1000000007) % 1000000007;
            ans = (ans + c1*i) % 1000000007;
            c0 = (c0 + c1) % 1000000007;
        }
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = (ans * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }

    public static int nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % 1000000007;
    }
}