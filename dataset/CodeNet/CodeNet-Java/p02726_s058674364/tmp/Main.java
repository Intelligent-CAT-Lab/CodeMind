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
                    ans[IntMath.min(Math.abs(i - j), Math.abs(i - x) + Math.abs(j - y) + 1, Math.abs(j - x) + Math.abs(i - y) + 1)]++;
System.out.println("[INST]42;None;Math.abs(i - j);"+Math.abs(i - j));
System.out.println("[INST]42;None;Math.abs(i - x);"+Math.abs(i - x));
System.out.println("[INST]42;None;Math.abs(j - y);"+Math.abs(j - y));
System.out.println("[INST]42;None;Math.abs(j - x);"+Math.abs(j - x));
System.out.println("[INST]42;None;Math.abs(i - y);"+Math.abs(i - y));
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
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]59;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]61;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]66;None;tokenizer.nextToken();"+tokenizer.nextToken());
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
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
System.out.println("[INST]85;None;Charset.defaultCharset();"+Charset.defaultCharset());
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
System.out.println("[INST]90;None;out.write(c);"+out.write(c));
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
System.out.println("[INST]100;None;out.write(s, 0, s.length());"+out.write(s, 0, s.length()));
System.out.println("[INST]100;None;s.length();"+s.length());
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
System.out.println("[INST]116;None;Integer.toString(i);"+Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
System.out.println("[INST]120;None;System.lineSeparator();"+System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
System.out.println("[INST]124;None;out.flush();"+out.flush());
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
System.out.println("[INST]147;None;Arrays.stream(v);"+Arrays.stream(v));
        }

    }
}

