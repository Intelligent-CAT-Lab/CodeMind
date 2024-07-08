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
var newVariable_0 = s.length();            for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = s.charAt(i);                cnt[newVariable_1 - 'a']++;
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

var newVariable_2 = cnt.clone();            boolean ans = pos(s, newVariable_2, "abc");
var newVariable_3 = cnt.clone();            ans |= pos(s, newVariable_3, "acb");
var newVariable_4 = cnt.clone();            ans |= pos(s, newVariable_4, "bac");
var newVariable_5 = cnt.clone();            ans |= pos(s, newVariable_5, "bca");
var newVariable_6 = cnt.clone();            ans |= pos(s, newVariable_6, "cab");
var newVariable_7 = cnt.clone();            ans |= pos(s, newVariable_7, "cba");
            out.println(ans ? "YES" : "NO");
        }

        private boolean pos(String s, int[] cnt, String pref) {
            int N = s.length();
            int[] need = new int[3];
            for (int i = 0; i < 3; i++) {
var newVariable_8 = pref.charAt(i);                need[newVariable_8 - 'a'] = ceil(N - i, 3);
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
var newVariable_9 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_9) {
                try {
var newVariable_10 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_10);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_11 = tokenizer.nextToken();            return newVariable_11;
        }

    }
}

