import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Palindromephobia solver = new Palindromephobia();
        solver.solve(1, in, out);
        out.close();
    }

    static class Palindromephobia {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int[] cnt = new int[3];
            for (int i = 0; i < s.length(); i++) {
                cnt[s.charAt(i) - 'a']++;
            }

            int N = s.length();
            if (N <= 2) {
                for (int i = 0; i < 3; i++) {
                    if (cnt[i] > 1) {
                        out.println("NO");
                        return;
                    }
                }
                out.println("YES");
                return;
            }

            boolean ans = pos(s, cnt.clone(), "abc");
            ans |= pos(s, cnt.clone(), "acb");
            ans |= pos(s, cnt.clone(), "bac");
            ans |= pos(s, cnt.clone(), "bca");
            ans |= pos(s, cnt.clone(), "cab");
            ans |= pos(s, cnt.clone(), "cba");
            out.println(ans ? "YES" : "NO");
        }

        private boolean pos(String s, int[] cnt, String pref) {
            int N = s.length();
            int[] need = new int[3];
            for (int i = 0; i < 3; i++) {
                need[pref.charAt(i) - 'a'] = ceil(N - i, 3);
            }

            for (int i = 0; i < 3; i++) {
                if (need[i] > cnt[i]) return false;
            }
            return true;
        }

        private int ceil(int n, int k) {
            return (n + k - 1) / k;
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
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}

