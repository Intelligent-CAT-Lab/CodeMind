import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class p02169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 0; i < k; i++) {
            ans *= m;
            ans %= 998244353;
        }
        long[] p = new long[k + 1];
        p[0] = 1;
        for (int i = 1; i <= k; i++) {
            p[i] = p[i - 1] * i % 998244353;
        }
        long c = m;
        long[][] comb = new long[k + 1][k + 1];
        comb[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % 998244353;
            }
        }
        for (int i = 1; i <= k; i++) {
            long k = 0;
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    k -= comb[i][j] * p[j] % 998244353;
                } else {
                    k += comb[i][j] * p[j] % 998244353;
                }
            }
            k *= c;
            c *= (m - i);
            c %= 998244353;
            c *= pow(i + 1, 998244352, 998244353);
            c %= 998244353;
            ans -= k;
            ans %= 998244353;
        }
        System.out.println(ans);
    }

    private static long pow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result *= a;
                result %= mod;
            }
            a *= a;
            a %= mod;
            b /= 2;
        }
        return result;
    }
}