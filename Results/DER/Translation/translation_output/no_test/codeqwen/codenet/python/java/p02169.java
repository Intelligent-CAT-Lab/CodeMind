```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < k) {
            System.out.println(0);
            return;
        }
        if (m < k) {
            System.out.println(0);
            return;
        }
        long ans = pow(m, n, 998244353);
        long[] p = new long[k + 1];
        for (int i = 1; i <= k; i++) {
            p[i] = pow(i, n, 998244353);
        }
        long c = m;
        long[][] comb = new long[k + 1][k + 1];
        comb[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % 998244353;
            }
        }
        for (int i = 1; i <= k; i++) {
            long k1 = 0;
            for (int j = i; j >= 1; j--) {
                if ((i + j) % 2 == 1) {
                    k1 -= comb[i][j] * p[j];
                } else {
                    k1 += comb[i][j] * p[j];
                }
            }
            k1 *= c;
            c *= (m - i);
            c *= pow(i + 1, 998244353 - 2, 998244353);
            c %= 998244353;
            ans -= k1;
            ans %= 998244353;
        }
        System.out.println(ans);
    }

    
