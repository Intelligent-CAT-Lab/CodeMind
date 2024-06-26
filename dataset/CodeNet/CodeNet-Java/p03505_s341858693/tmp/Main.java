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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
System.out.println("[INST]57;None;Charset.defaultCharset();"+Charset.defaultCharset());
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
System.out.println("[INST]62;None;out.write(c);"+out.write(c));
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
System.out.println("[INST]72;None;out.write(s, 0, s.length());"+out.write(s, 0, s.length()));
System.out.println("[INST]72;None;s.length();"+s.length());
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
System.out.println("[INST]88;None;Long.toString(l);"+Long.toString(l));
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
System.out.println("[INST]92;None;Integer.toString(i);"+Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
System.out.println("[INST]96;None;System.lineSeparator();"+System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
System.out.println("[INST]100;None;out.flush();"+out.flush());
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
System.out.println("[INST]127;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]129;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]134;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

