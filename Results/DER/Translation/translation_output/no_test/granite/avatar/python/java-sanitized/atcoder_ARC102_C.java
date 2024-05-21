import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    static long mod = 998244353;
    static long[] invf;
    static long[] frac;
    static long[] X;
    
    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l!= 0) {
            long x_ = x, y_ = y, u_ = u, v_ = v;
            x = u;
            y = v;
            u = x_ - u_ * (k / l);
            v = y_ - v_ * (k / l);
            k = l;
            l = k % l;
        }
        return x % mod;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int K = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        X = new long[2*K-1];
        frac = new long[N+K+1];
        frac[0] = 1;
        for (int i = 1; i <= N+K; i++) {
            frac[i] = (frac[i-1]*(i))%mod;
        }
        invf = new long[N+K+1];
        for (int i = 0; i <= N+K; i++) {
            invf[i] = inved(frac[i]);
        }
        for (int k = 2; k <= K; k++) {
            long S = 0;
            int sign = 1;
            int l = k/2;
            for (int m = 0; m <= Math.min(l, N/2); m++) {
                long prod = (sign*(frac[l]*frac[N+K-2*m-1])%mod)*(invf[m]*invf[l-m])%mod;
                prod = (prod*invf[N-2*m])%mod;
                prod = (prod*invf[K-1])%mod;
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k-2] = S;
            X[2*K-k] = S;
        }
        for (int i = 0; i < 2*K-1; i++) {
            System.out.println(X[i]);
        }
    }
}