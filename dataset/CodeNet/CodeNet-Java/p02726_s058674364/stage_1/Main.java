import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.NoSuchElementException;
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
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), x = in.ints(), y = in.ints();
            int[] ans = new int[n];
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
var newVariable_0 = Math.abs(i - j);var newVariable_1 = Math.abs(i - x);var newVariable_2 = Math.abs(j - y);var newVariable_3 = Math.abs(j - x);var newVariable_4 = Math.abs(i - y);                    ans[IntMath.min(Math.abs(i - j), Math.abs(i - x) + Math.abs(j - y) + 1, Math.abs(j - x) + newVariable_4 + 1)]++;
                }
            }
            for (int i = 1; i < n; i++) out.ans(ans[i]).ln();
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
var newVariable_5 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_5) {
                try {
var newVariable_6 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_6);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
var newVariable_7 = tokenizer.nextToken();            return newVariable_7;
        }

        public int ints() {
            return Integer.parseInt(string());
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
var newVariable_8 = Charset.defaultCharset();            this(new OutputStreamWriter(new BufferedOutputStream(out), newVariable_8));
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
var newVariable_9 = s.length();                out.write(s, 0, newVariable_9);
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
var newVariable_10 = Integer.toString(i);            return ans(newVariable_10);
        }

        public LightWriter ln() {
var newVariable_11 = System.lineSeparator();            print(newVariable_11);
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

    static final class IntMath {
        private IntMath() {
        }

        public static int min(int... v) {
            return Arrays.stream(v).min().orElseThrow(NoSuchElementException::new);
        }

    }
}

