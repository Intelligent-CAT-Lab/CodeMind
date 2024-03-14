import java.util.*;
import java.io.*;

public class p02932 {
    public static void main(String[] args) {
        new Main().run();
    }

    class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public Reader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        public String next() {
            while (st == null ||!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    int N, M, L, R;
    int MOD = 1000000007;

    int U = 600000 + 100;
    int[] fact = new int[U + 1];
    int[] fact_inv = new int[U + 1];
    int[] comb = new int[U + 1];

    void run() {
        Reader sc = new Reader();
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int i = U - 1; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % MOD;
        }

        for (int i = M; i <= N; i++) {
            comb[i] = fact[i - M] * fact_inv[i - M] % MOD * fact_inv[i - M + N - M] % MOD;
            if (i % 2 == 1) comb[i] = -comb[i];
        }

        int[] P = new int[R + 1];
        for (int i = M; i <= R; i++) {
            P[i] = (P[i - 1] + comb[i]) % MOD;
        }

        for (int i = M; i <= R; i++) {
            P[i] -= P[i - M];
            P[i] %= MOD;
        }

        int[] Q = new int[R + 1];
        for (int i = N; i <= N + R; i++) {
            Q[i - N] = fact[i] * fact_inv[i - N] % MOD * fact_inv[N] % MOD;
        }

        long answer = 0;
        for (int i = L; i <= R; i++) {
            answer += Q[i] * P[i] % MOD;
            answer %= MOD;
        }
        System.out.println(answer);
    }

    int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = ans * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}