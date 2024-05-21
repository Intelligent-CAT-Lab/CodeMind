import java.io.*;
import java.util.*;

public class p03629 {
    static FastScanner in;
    static PrintWriter out;
    static final int MOD = 100000007;

    public static void main(String[] args) throws IOException {
        //        Scanner in = new Scanner(new File("input.txt"));
        //        Scanner in = new Scanner(System.in);
        //        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")), true));
        out = new PrintWriter(System.out);
        in = new FastScanner(System.in);
        //        in = new FastScanner("input.txt");
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream i) {
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }

        public FastScanner(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
            st = new StringTokenizer("");
        }

        public String next() throws IOException {
            if (st.hasMoreTokens())
                return st.nextToken();
            else
                st = new StringTokenizer(br.readLine());
            return next();
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
    }

    static char[] s;
    static int[][] next;
    static int[] ansNext;
    static int[] ansLetter;
    static int[] nonSubseqLen;

    static void solve() throws IOException {
        s = in.next().toCharArray();
        int n = s.length;
        next = new int[n][26];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (i == n - 1) {
                    next[i][j] = s[i] - 'a' == j? n : i + 1;
                } else {
                    next[i][j] = next[i + 1][j];
                    if (s[i] - 'a' == j) {
                        next[i][j] = i;
                    }
                }
            }
        }
        nonSubseqLen = new int[n + 1];
        ansNext = new int[n + 1];
        ansLetter = new int[n + 1];
        nonSubseqLen[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int nextPos = next[i][j];
                int newLen = nonSubseqLen[nextPos + 1] + 1;
                if (newLen < nonSubseqLen[i]) {
                    nonSubseqLen[i] = newLen;
                    ansLetter[i] = j;
                    ansNext[i] = nextPos + 1;
                }
            }
        }
        int cur = 0;
        StringBuilder sb = new StringBuilder();
        while (cur < n) {
            sb.append((char) (ansLetter[cur] + 'a'));
            cur = ansNext[cur];
        }
        out.println(sb.toString());
    }
}