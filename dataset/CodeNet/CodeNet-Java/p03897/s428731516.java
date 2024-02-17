import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
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
        JConnectedCheckerboard solver = new JConnectedCheckerboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class JConnectedCheckerboard {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            Set<Vec2i> ans = new HashSet<>();
            for (int i = 1; i < n; i += 2) {
                ans.add(new Vec2i(i, 0));
                ans.add(new Vec2i(0, i));
            }
            for (int i = n % 2; i < n; i += 2) {
                ans.add(new Vec2i(i, n - 1));
                ans.add(new Vec2i(n - 1, i));
            }
            int offset = 0;
            int d = 2;
            for (int unused = 0; unused < 10; unused++) {
                for (int i = 1; i < n; i += 2 * d) {
                    for (int j = offset; j < n; j += 2 * d) {
                        ans.add(new Vec2i(i, j));
                    }
                }
                for (int i = d + 1; i < n; i += 2 * d) {
                    for (int j = offset + d; j < n; j += 2 * d) {
                        ans.add(new Vec2i(i, j));
                    }
                }

                offset += d;
                d *= 2;
            }

            out.ans(ans.size()).ln();
            for (Vec2i an : ans) {
                out.ans(an.x).ans(an.y).ln();
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
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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
                out.write(s, 0, s.length());
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
        }

        public LightWriter ln() {
            print(System.lineSeparator());
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

    static class Vec2i implements Comparable<Vec2i> {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x && y == vec2i.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public int compareTo(Vec2i o) {
            if (x == o.x) {
                return Integer.compare(y, o.y);
            }
            return Integer.compare(x, o.x);
        }

    }
}

