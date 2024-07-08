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
        AKaiden solver = new AKaiden();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKaiden {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            long k = in.longs(), a = in.longs(), b = in.longs();
            if (k <= a) {
                out.ans(1).ln();
            } else if (a - b <= 0) {
                out.ans(-1).ln();
            } else {
                out.ans((k - b - 1) / (a - b) * 2 + 1).ln();
            }
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

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
var newVariable_2 = Long.toString(l);            return ans(newVariable_2);
        }

        public LightWriter ans(int i) {
var newVariable_3 = Integer.toString(i);            return ans(newVariable_3);
        }

        public LightWriter ln() {
var newVariable_4 = System.lineSeparator();            print(newVariable_4);
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
var newVariable_5 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_5) {
                try {
var newVariable_6 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_6);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
var newVariable_7 = tokenizer.nextToken();            return newVariable_7;
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

