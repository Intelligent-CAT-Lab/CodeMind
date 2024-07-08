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
var newVariable_0 = set.add(1);            int tmp = 6;
            while (tmp <= n) {
var newVariable_1 = set.add(tmp);                tmp *= 6;
            }
            tmp = 9;
            while (tmp <= n) {
var newVariable_2 = set.add(tmp);                tmp *= 9;
            }

            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE / 2);
            dp[0] = 0;

            for (int i = 0; i <= n; i++) {
                for (int x : set) {
                    if (i + x <= n) {
var newVariable_3 = Math.min(dp[i + x], dp[i] + 1);                        dp[i + x] = newVariable_3;
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
var newVariable_4 = st.hasMoreTokens();            while (!newVariable_4) {
                try {
var newVariable_5 = br.readLine();                    st = new StringTokenizer(newVariable_5, " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
var newVariable_6 = st.nextToken();            return newVariable_6;
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

