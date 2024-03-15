import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int mod = 1000000007;
        int cms = 1000000;
        long[] cm = new long[cms];
        cm[0] = 1;
        for(int i = 1; i < cms; i++) {
            cm[i] = cm[i-1] * i % mod;
        }
        long inv(long x) {
            return pow(x, mod - 2, mod);
        }
        long comb(int a, int b) {
            return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod;
        }
        long f(int n, int m, int k) {
            long r = 0;
            for(int i = 0; i <= k; i++) {
                int j = k - i;
                long mt = comb(n+m+k*2, n+i*2);
                long lk = rk = 1;
                if(i > 0) {
                    lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod;
                }
                if(j > 0) {
                    rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod;
                }
                r += mt * lk * rk % mod;
                r %= mod;
            }
            return r;
        }
        while(1) {
            int n = 0, m = 0, k = 0;
            n = 1;
            m = 1;
            k = 1;
            if(n == 0) {
                break;
            }
            System.out.println(f(n,m,k));
            break;
        }
    }
}