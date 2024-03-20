import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;

public class p03897 {
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

        public