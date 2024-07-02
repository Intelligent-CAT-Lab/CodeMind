import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.security.AccessControlException;
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
        ASubscribers solver = new ASubscribers();
        solver.solve(1, in, out);
        out.close();
    }

    static class ASubscribers {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints(), x = in.ints(), y = in.ints();
            out.ans(Math.min(x, y)).ans(Math.max(x + y - n, 0)).ln();
System.out.println("[INST]38;None;Math.min(x, y);"+Math.min(x, y));
System.out.println("[INST]38;None;Math.max(x + y - n, 0);"+Math.max(x + y - n, 0));
        }

    }

    static class Debug {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
System.out.println("[INST]54;debugRegex;Pattern.compile(DEBUG_CALL_PATTERN);"+debugRegex);
            }
        }

        public static boolean autoEnable() {
            try {
                String s = System.getProperty(DEBUG_PROPERTY);
System.out.println("[INST]60;s;System.getProperty(DEBUG_PROPERTY);"+s);
                if (s != null) {
                    enable(s);
                    return true;
                }
            } catch (AccessControlException ex) {
                src = null;
            }
            return false;
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
System.out.println("[INST]83;None;Charset.defaultCharset();"+Charset.defaultCharset());
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
System.out.println("[INST]88;None;out.write(c);"+out.write(c));
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
System.out.println("[INST]98;None;out.write(s, 0, s.length());"+out.write(s, 0, s.length()));
System.out.println("[INST]98;None;s.length();"+s.length());
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
System.out.println("[INST]114;None;Integer.toString(i);"+Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
System.out.println("[INST]118;None;System.lineSeparator();"+System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
System.out.println("[INST]122;None;out.flush();"+out.flush());
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
System.out.println("[INST]149;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]151;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]156;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

