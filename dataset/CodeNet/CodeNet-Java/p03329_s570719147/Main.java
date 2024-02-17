import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            Set<Integer> set = new TreeSet<>();
            set.add(1);
            int tmp = 6;
            while (tmp <= n) {
                set.add(tmp);
                tmp *= 6;
            }
            tmp = 9;
            while (tmp <= n) {
                set.add(tmp);
                tmp *= 9;
            }

            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE / 2);
            dp[0] = 0;

            for (int i = 0; i <= n; i++) {
                for (int x : set) {
                    if (i + x <= n) {
                        dp[i + x] = Math.min(dp[i + x], dp[i] + 1);
                    }
                }
            }

            out.println(dp[n]);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

