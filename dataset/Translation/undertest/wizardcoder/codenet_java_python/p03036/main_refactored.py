class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;
    import java.io.PrintWriter;
    import java.io.BufferedWriter;
    import java.io.Writer;
    import java.io.OutputStreamWriter;
    import java.util.InputMismatchException;
    import java.io.IOException;
    import java.io.InputStream;
    
    /**
     * Built using CHelper plug-in
     * Actual solution is at the top
     *
     * @author prakharjain
     */
    public class p03036 {
        public static void main(String[] args) {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            OutputWriter out = new OutputWriter(outputStream);
            BAlgae solver = new BAlgae();
            solver.solve(1, in, out);
            out.close();
        }
    
        static class BAlgae {
            public void solve(int testNumber, InputReader in, OutputWriter out) {
                long r = in.nextInt();
    
                long d = in.nextInt();
    
                long x = in.nextInt();
    
                for (int i = 0; i < 10; i++) {
                    x = r * x - d;
    
                    out.println(x);
                }
            }
    
        }
    
        static class OutputWriter {
            private final PrintWriter writer;
    
            public OutputWriter(OutputStream outputStream) {
                writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
            }
    
            public OutputWriter(Writer writer) {
                this.writer = new PrintWriter(writer);
            }
    
            public void close() {
                writer.close();
            }
    
            public void println(long i) {
                writer.println(i);
            }
    
        }
    
        static class InputReader {
            private BufferedReader reader;
            private StringTokenizer tokenizer;
    
            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream));
                tokenizer = null;
            }
    
            public String next() {
                while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                }
                return tokenizer.nextToken();
            }
    
            public int nextInt() {
                return Integer.parseInt(next());
            }
    
            public long nextLong() {
                return Long.parseLong(next());
            }
    
            public double nextDouble() {
                return Double.parseDouble(next());
            }
    
            public char[] nextCharArray() {
                return next().toCharArray();
            }
    
            public boolean hasNext() {
                try {
                    String string = reader.readLine();
                    if (string == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(string);
                    return tokenizer.hasMoreTokens();
                } catch (IOException e) {
                    return false;
                }
            }
    
            public boolean hasNextInt() {
                try {
                    return hasNext() && Integer.parseInt(next())!= 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
    
            public boolean hasNextLong() {
                try {
                    return hasNext() && Long.parseLong(next())!= 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
    
            public boolean hasNextDouble() {
                try {
                    return hasNext() && Double.parseDouble(next())!= 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
    
            public boolean hasNextChar() {
                try {
                    return hasNext() && next().length() == 1;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
    
            public boolean hasNextCharArray() {
                try {
                    return hasNext() && next().length() > 0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
    
        }
    }