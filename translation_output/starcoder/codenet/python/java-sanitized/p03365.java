import java.util.*;
import java.io.*;

public class p03365 {
    public static void main(String[] args) {
        new Main().run();
    }

    class Reader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = new StringTokenizer("");
        }

        public Reader(String s) throws FileNotFoundException {
            reader = new BufferedReader(new FileReader(s));
            tokenizer = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (!tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }
    }

    public void run() {
        Reader r = new Reader();
        int T = r.nextInt();
        for (int c = 1; c <= T; c++) {
            int n = r.nextInt();
            System.out.println("Case #" + c + ": " + solve(n));
        }
    }

    int solve(int n) {
        int[] fact = new int[n+1];
        int[] ifact = new int[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            ifact[i] = pow(fact[i], MOD-2, MOD);
        }

        int ans = 0;
        int c0 = 0;
        for (int i = n/2; i <= n; i++) {
            int c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + MOD) % MOD;
            ans = (ans + c1*i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        return ans;
    }

    int pow(int a, int b, int MOD) {
        int ans = 1;
        while (b > 0) {
            if ((b&1) == 1) ans = (ans * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return ans;
    }

    int nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % MOD;
    }

    int MOD = 1000000007;
    int[] fact = new int[100001];
    int[] ifact = new int[100001];
}