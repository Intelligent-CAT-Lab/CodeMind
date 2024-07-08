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
var newVariable_0 = Math.min(x, y);var newVariable_1 = Math.max(x + y - n, 0);            out.ans(Math.min(x, y)).ans(newVariable_1).ln();
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
            }
        }

        public static boolean autoEnable() {
            try {
                String s = System.getProperty(DEBUG_PROPERTY);
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
var newVariable_2 = Charset.defaultCharset();            this(new BufferedWriter(new OutputStreamWriter(out, newVariable_2)));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
var newVariable_3 = s.length();                out.write(s, 0, newVariable_3);
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
var newVariable_4 = Integer.toString(i);            return ans(newVariable_4);
        }

        public LightWriter ln() {
var newVariable_5 = System.lineSeparator();            print(newVariable_5);
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
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
var newVariable_6 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_6) {
                try {
var newVariable_7 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_7);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
var newVariable_8 = tokenizer.nextToken();            return newVariable_8;
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

