```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static final long MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U + 1];
    static long[] factInv = new long[U + 1];

    static void calculateFactorials() {
        fact[0] = 1;
        factInv[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        factInv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U - 1; n >= 1; n--) {
            factInv[n] = factInv[n + 1] * (n + 1) % MOD;
        }
    }

    static long pow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    static long comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * factInv[k] % MOD * factInv[n - k] % MOD;
    }

    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result = (result + comb(x, i) * pow(2, i, MOD) % MOD * comb(N + y - 1, i + y - 1) % MOD) % MOD;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        calculateFactorials();

        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();
        for (int S = 3; S <= K + 3; S += 2) {
            int x = (int) F((S - 1) / 2, K - S + 1, N);
            sb.append(x).append("\n");
            sb.append(x).append("\n");
        }

        if ((K & 1) == 1) {
            sb.deleteCharAt(sb.length() - 1);
            sb.append(sb.toString().trim()).reverse();
        } else {
            sb.append(sb.toString().trim()).reverse();
        }

        out.println(sb.toString().trim());
        out.flush();
        out.close();
    }
}
```  
