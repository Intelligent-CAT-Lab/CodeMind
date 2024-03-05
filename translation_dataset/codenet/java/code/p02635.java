import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p02635 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CShift solver = new CShift();
        solver.solve(1, in, out);
        out.close();
    }

    static class CShift {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            char[] str = in.chars();
            int k = in.ints();
            int[] a;
            int n;
            {
                List<Integer> rlc = new ArrayList<>();
                int count = 0;
                for (int i = str.length - 1; i >= 0; i--) {
                    if (str[i] == '0') {
                        rlc.add(count);
                        count = 0;
                    } else count++;
                }
                rlc.add(count);
                n = rlc.size();
                a = new int[n];
                for (int i = 0; i < n; i++) a[i] = rlc.get(i);
            }
            int ones = n - 1, zeros = str.length - ones;
            if (ones == 0 || zeros == 0) {
                out.ans(1).ln();
                return;
            }

            long[][][] dp = new long[n + 1][zeros + 1][zeros + 1];
            long[][] sum0 = new long[zeros + 1][zeros + 1], sum1 = new long[zeros + 1][zeros + 1];
            dp[0][0][0] = 1;
            for (int i = 0; i < n; i++) {
                // sum0
                for (int total = 0; total <= zeros; total++) {
                    sum0[total][0] = dp[i][total][0];
                    for (int now = 1; now <= zeros; now++) {
                        sum0[total][now] = (sum0[total][now - 1] + dp[i][total][now]) % MOD;
                    }
                }
                // sum1
                for (int total = 0; total <= zeros; total++) {
                    for (int now = 0; now <= zeros; now++) {
                        sum1[total][now] = dp[i][total][now];
                        if (total > 0 && now > 0) {
                            sum1[total][now] += sum1[total - 1][now - 1];
                            sum1[total][now] %= MOD;
                        }
                    }
                }

                // thru
                for (int total = 0; total <= zeros; total++) {
                    System.arraycopy(dp[i][total], 0, dp[i + 1][total], 0, zeros + 1);
                }

                // put
                for (int total = 0; total <= zeros; total++) {
                    for (int now = 0; now <= total; now++) {
                        dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + MOD);
                        dp[i + 1][total][now] %= MOD;
                    }
                }

                // take
                for (int total = 1; total <= zeros; total++) {
                    for (int now = 1; now <= total; now++) {
                        int min = Math.min(total, Math.min(now, a[i]));
                        for (int take = 1; take <= min; take++) {
                            dp[i + 1][total][now] += dp[i][total - take][now - take];
                        }
                        //dp[i + 1][total][now] += sum1[total - 1][now - 1];
                        //if (now - min - 1 >= 0) dp[i + 1][total][now] += MOD - sum1[total - min - 1][now - min - 1];
                        dp[i + 1][total][now] %= MOD;
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i <= Math.min(k, zeros); i++) ans += dp[n][i][0];
            out.ans(ans % MOD).ln();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public char[] chars() {
            return string().toCharArray();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

