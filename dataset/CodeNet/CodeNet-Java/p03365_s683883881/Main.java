import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    int n;
    long[] fac, iFac;
    int MOD = 1000000007;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        solve();
    }

    void solve() {
        fac = new long[n + 1];
        iFac = new long[n + 1];
        fillFactorials();
        long ans = 0;
        long prevWays = 0;
        if (n == 2) {
            ans = 1;
        } else if (n == 3) {
            ans = 4;
        } else {
            int start = (n % 2 == 0) ? n / 2 : (n + 1) / 2;
            for (int k = start; k < n; k++) {
                long ways = (combination(k - 1, n - 1 - k) * fac[k] % MOD) *
                        fac[n - 1 - k] % MOD;
                ans = (ans + (ways - prevWays + MOD) % MOD * k % MOD ) % MOD;
                prevWays = ways;
            }
        }
        System.out.println(ans);
    }

    long combination(int n, int r) {
        if (n < r) return 0;
        if (n < 0) return 0;
        return fac[n] * iFac[n - r] % MOD * iFac[r] % MOD;
    }

    void fillFactorials() {
        fac[0] = 1;
        iFac[0] = 1;
        for (int i = 1; i < fac.length; i++) {
            fac[i] = i * fac[i - 1] % MOD;
            //iFac[i] = (new BigInteger(Long.toString(fac[i]))).modPow(
            //        new BigInteger(Long.toString(MOD - 2)),
            //                new BigInteger(Integer.toString(MOD))).longValue();
            iFac[i] = power(fac[i], MOD - 2, MOD);
        }
    }

    long power(long a, long b, long mod) {
        long x = 1;
        long y = a;
        while (b > 0) {
            if (b % 2 == 1) {
                x = x * y % mod;
            }
            y = y * y % mod;
            b /= 2;
        }
        return x % mod;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
