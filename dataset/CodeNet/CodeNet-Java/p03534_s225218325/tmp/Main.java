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
System.out.println("[INST]29;None;s.length();"+s.length());
                cnt[s.charAt(i) - 'a']++;
System.out.println("[INST]30;None;s.charAt(i);"+s.charAt(i));
            }

            int N = s.length();
System.out.println("[INST]33;N;s.length();"+N);
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
System.out.println("[INST]45;None;cnt.clone();"+cnt.clone());
            ans |= pos(s, cnt.clone(), "acb");
System.out.println("[INST]46;None;cnt.clone();"+cnt.clone());
            ans |= pos(s, cnt.clone(), "bac");
System.out.println("[INST]47;None;cnt.clone();"+cnt.clone());
            ans |= pos(s, cnt.clone(), "bca");
System.out.println("[INST]48;None;cnt.clone();"+cnt.clone());
            ans |= pos(s, cnt.clone(), "cab");
System.out.println("[INST]49;None;cnt.clone();"+cnt.clone());
            ans |= pos(s, cnt.clone(), "cba");
System.out.println("[INST]50;None;cnt.clone();"+cnt.clone());
            out.println(ans ? "YES" : "NO");
        }

        private boolean pos(String s, int[] cnt, String pref) {
            int N = s.length();
System.out.println("[INST]55;N;s.length();"+N);
            int[] need = new int[3];
            for (int i = 0; i < 3; i++) {
                need[pref.charAt(i) - 'a'] = ceil(N - i, 3);
System.out.println("[INST]58;None;pref.charAt(i);"+pref.charAt(i));
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
System.out.println("[INST]83;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]85;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]90;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

    }
}

