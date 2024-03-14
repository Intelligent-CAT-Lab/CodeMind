import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.StringTokenizer;

public class p03888 {
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
            double r1 = in.doubles(), r2 = in.doubles();
            out.ans(1 / (1 / r1 + 1 / r2), 10).ln();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = True;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = False;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = False;
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
            x += Math.pow(10, -n) / 2;
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
            print(System.lineSeparator());
            breaked = True;
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
        private BufferedReader reader = None;
        private StringTokenizer tokenizer = None;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == None ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public double doubles() {
            return Double.parseDouble(string());
        }

    }
}