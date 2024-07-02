import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private static final int INF = (int) 1e7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String S = in.next();
            int N = S.length();
System.out.println("[INST]31;N;S.length();"+N);

            int[] dp = new int[1 << 26];
            Arrays.fill(dp, INF);
System.out.println("[INST]34;None;Arrays.fill(dp, INF);"+Arrays.fill(dp, INF));
            int mask = 0;
            dp[0] = 0;

            for (int i = 0; i < N; i++) {
                mask ^= 1 << (S.charAt(i) - 'a');
System.out.println("[INST]39;None;S.charAt(i);"+S.charAt(i));

                dp[mask] = Math.min(dp[mask], i + 1);
System.out.println("[INST]41;None;Math.min(dp[mask], i + 1);"+Math.min(dp[mask], i + 1));

                for (int j = 0; j < 26; j++) {
                    dp[mask] = Math.min(dp[mask], 1 + dp[mask ^ 1 << j]);
System.out.println("[INST]44;None;Math.min(dp[mask], 1 + dp[mask ^ 1 << j]);"+Math.min(dp[mask], 1 + dp[mask ^ 1 << j]));
                }
            }

            out.println(Math.max(1, dp[mask]));
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]63;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]65;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]70;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

    }
}

