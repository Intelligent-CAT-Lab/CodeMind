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
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        AEquivalentResistance solver = new AEquivalentResistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class AEquivalentResistance {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            float r1 = (float) in.doubles(), r2 = (float) in.doubles();
            out.ans(1 / (1 / r1 + 1 / r2), 10).ln();
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
var newVariable_0 = Charset.defaultCharset();            this(new BufferedWriter(new OutputStreamWriter(out, newVariable_0)));
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
var newVariable_1 = s.length();                out.write(s, 0, newVariable_1);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
var newVariable_2 = Math.pow(10, -n);            x += newVariable_2 / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
        }

        public LightWriter ln() {
var newVariable_3 = System.lineSeparator();            print(newVariable_3);
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
var newVariable_4 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_4) {
                try {
var newVariable_5 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_5);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
var newVariable_6 = tokenizer.nextToken();            return newVariable_6;
        }

        public double doubles() {
            return Double.parseDouble(string());
        }

    }
}

