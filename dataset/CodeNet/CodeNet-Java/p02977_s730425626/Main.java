import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int prev = (n + 1) / 4 * 4 - 1;
            if (prev > 0 && (n & (n - 1)) != 0) {
                out.println("Yes");
                int[] seq = new int[2 * prev];
                for (int i = 0; i < prev; ++i) {
                    seq[i] = i + 1;
                }
                for (int i = 0; i < prev; ++i) {
                    seq[i + prev] = n + i + 1;
                }
                for (int i = 1; i < seq.length; ++i) {
                    out.println(seq[i - 1] + " " + seq[i]);
                }
                int[] pxor = new int[seq.length + 1];
                for (int i = 0; i < seq.length; ++i) {
                    pxor[i + 1] = pxor[i] ^ ((seq[i] - 1) % n + 1);
                }
                if (pxor[seq.length / 2] != 0) throw new RuntimeException();
                if (pxor[seq.length] != 0) throw new RuntimeException();
                if (n >= prev + 2) {
                    out.println((prev + 2) + " " + (prev + 1));
                    out.println((prev + 1) + " " + (1));
                    out.println(1 + " " + (n + prev + 2));
                    out.println((n + prev + 2) + " " + (n + prev + 1));
                    if (n > prev + 2) {
                        if (n != prev + 3) throw new RuntimeException();
                        boolean ok = false;
                        for (int dest = 0; dest < seq.length && !ok; ++dest) {
                            if (pxor[dest + 1] == n) {
                                ok = true;
                                out.println(n + " " + 1);
                                out.println(seq[dest] + " " + (n + n));
                            } else if (pxor[dest + 1] == (n ^ (prev + 1))) {
                                ok = true;
                                out.println(n + " " + (prev + 1));
                                out.println(seq[dest] + " " + (n + n));
                            } else if (pxor[dest + 1] == (n ^ (prev + 2))) {
                                ok = true;
                                out.println(n + " " + (n + prev + 2));
                                out.println(seq[dest] + " " + (n + n));
                            }
                        }
                        if (!ok) throw new RuntimeException();
                    }
                } else if (n == prev + 1) {
                    boolean ok = false;
                    for (int src = 0; src < seq.length && !ok; ++src) {
                        for (int dest = src; dest < seq.length && !ok; ++dest) {
                            if ((pxor[src] ^ pxor[dest + 1]) == n) {
                                ok = true;
                                out.println(n + " " + seq[src]);
                                out.println(seq[dest] + " " + (n + n));
                            }
                        }
                    }
                    if (!ok) throw new RuntimeException();
                } else if (n != prev) {
                    throw new RuntimeException();
                }
            } else {
                out.println("No");
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

