import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static final long MODULO = 998244353;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            Map<String, Long> cache = new HashMap<>();
            out.println(doit(s, cache));
        }

        private long doit(String s, Map<String, Long> cache) {
var newVariable_0 = s.length();            if (newVariable_0 == 0) return 1;
            Long cached = cache.get(s);
            if (cached != null) return cached;
var newVariable_1 = s.substring(1);            long woFirst = doit(newVariable_1, cache);
            long res = woFirst;
var newVariable_2 = s.charAt(0);            if (newVariable_2 == '1') res += woFirst;
var newVariable_3 = s.length();            for (int len = 1; len * 2 <= newVariable_3; ++len) {
                char[] cand = new char[len];
                Arrays.fill(cand, '1');
var newVariable_4 = s.length();                for (int rep = 0; len * (rep + 1) <= newVariable_4; ++rep) {
                    for (int i = 0; i < len; ++i) {
var newVariable_5 = s.charAt(len * rep + i);                        if (newVariable_5 == '0') cand[i] = '0';
                    }
                    if (rep >= 1) {
                        long cur = doit(new String(cand), cache);
var newVariable_6 = s.substring(len * (rep + 1));                        cur *= doit(newVariable_6, cache);
                        cur %= MODULO;
                        res += cur;
                    }
                }
            }
            res %= MODULO;
var newVariable_7 = cache.put(s, res);            return res;
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
var newVariable_8 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_8) {
                try {
var newVariable_9 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_9);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_10 = tokenizer.nextToken();            return newVariable_10;
        }

    }
}

