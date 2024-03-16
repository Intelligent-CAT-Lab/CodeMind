import java.util.*;
import java.io.*;

public class p02169 {
    static long mod = 998244353;
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
  
    public static void solve(Scanner sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        
        long ans = pow(m, n, mod);
        long[] p = new long[k+1];
        
        for (int i = 0; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }
        
        long c = m;
        long[][] comb = new long[k+1][k+1];
        comb[0][0] = 1;
        
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        
        for (int i = 1; i < k; i++) {
            long current = 0;
            for (int j = i; j > 0; j--) {
                if ((i + j) % 2 == 1) {
                    current -= comb[i][j] * p[j];
                } else {
                    current += comb[i][j] * p[j];
                }
            }
            
            current *= c;
            c *= (m - i);
            c *= modInverse(i + 1, mod);
            c %= mod;
            ans -= current;
            ans %= mod;
        }
        
        System.out.println(ans);
    }
  
    static long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        
        long half = pow(base, exp / 2, mod);
        long result = half * half % mod;
        
        if (exp % 2 == 1) {
            result = result * base % mod;
        }
        
        return result;
    }
  
    static long modInverse(long a, long mod) {
        return pow(a, mod - 2, mod);
    }
}