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
            if (s.length() == 0) return 1;
System.out.println("[INST]38;None;s.length();"+s.length());
            Long cached = cache.get(s);
System.out.println("[INST]39;cached;cache.get(s);"+cached);
            if (cached != null) return cached;
            long woFirst = doit(s.substring(1), cache);
System.out.println("[INST]41;None;s.substring(1);"+s.substring(1));
            long res = woFirst;
            if (s.charAt(0) == '1') res += woFirst;
System.out.println("[INST]43;None;s.charAt(0);"+s.charAt(0));
            for (int len = 1; len * 2 <= s.length(); ++len) {
System.out.println("[INST]44;None;s.length();"+s.length());
                char[] cand = new char[len];
                Arrays.fill(cand, '1');
System.out.println("[INST]46;None;Arrays.fill(cand, '1');"+Arrays.fill(cand, '1'));
                for (int rep = 0; len * (rep + 1) <= s.length(); ++rep) {
System.out.println("[INST]47;None;s.length();"+s.length());
                    for (int i = 0; i < len; ++i) {
                        if (s.charAt(len * rep + i) == '0') cand[i] = '0';
System.out.println("[INST]49;None;s.charAt(len * rep + i);"+s.charAt(len * rep + i));
                    }
                    if (rep >= 1) {
                        long cur = doit(new String(cand), cache);
                        cur *= doit(s.substring(len * (rep + 1)), cache);
System.out.println("[INST]53;None;s.substring(len * (rep + 1));"+s.substring(len * (rep + 1)));
                        cur %= MODULO;
                        res += cur;
                    }
                }
            }
            res %= MODULO;
            cache.put(s, res);
System.out.println("[INST]60;None;cache.put(s, res);"+cache.put(s, res));
            return res;
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
System.out.println("[INST]76;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]78;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]83;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

    }
}

