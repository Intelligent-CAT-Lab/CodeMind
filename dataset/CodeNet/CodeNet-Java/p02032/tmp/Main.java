import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CDivisorGame solver = new CDivisorGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisorGame {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            long n = in.longs();
            Map<Long, Integer> pf = new HashMap<>();
            for (long i = 2; i * i <= n; i++) {
                int c = 0;
                while (n % i == 0) {
                    n /= i;
                    c++;
                }
                if (c > 0) {
                    pf.put(i, c);
System.out.println("[INST]48;None;pf.put(i, c);"+pf.put(i, c));
                }
            }
            if (n > 1) {
                pf.put(n, 1);
System.out.println("[INST]52;None;pf.put(n, 1);"+pf.put(n, 1));
            }

            long ans = 1;
            for (Map.Entry<Long, Integer> ent : pf.entrySet()) {
System.out.println("[INST]56;None;pf.entrySet();"+pf.entrySet());
                ans *= (ent.getValue() + 1L);
System.out.println("[INST]57;None;ent.getValue();"+ent.getValue());
            }
            out.ans(pf.size()).ans(ans - 1).ln();
System.out.println("[INST]59;None;pf.size();"+pf.size());
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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
System.out.println("[INST]74;None;Charset.defaultCharset();"+Charset.defaultCharset());
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
System.out.println("[INST]79;None;out.write(c);"+out.write(c));
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
System.out.println("[INST]89;None;out.write(s, 0, s.length());"+out.write(s, 0, s.length()));
System.out.println("[INST]89;None;s.length();"+s.length());
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
System.out.println("[INST]105;None;Long.toString(l);"+Long.toString(l));
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
System.out.println("[INST]109;None;Integer.toString(i);"+Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
System.out.println("[INST]113;None;System.lineSeparator();"+System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
System.out.println("[INST]117;None;out.flush();"+out.flush());
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

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]144;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]146;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]151;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static class Debug {
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
System.out.println("[INST]170;debugRegex;Pattern.compile(DEBUG_CALL_PATTERN);"+debugRegex);
            }
        }

    }
}


