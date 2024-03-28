class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.PrintWriter;
    import java.util.StringTokenizer;
    
    public class p02612 {
        public static void main(String[] args) {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    
        static class TaskA {
            public void solve(int testNumber, InputReader in, PrintWriter out) {
                int n = in.nextInt();
                int x = n / 1000;
                int y = n % 1000;
                if (y == 0) out.println(0);
                else {
                    int ans = 1000 * (x + 1) - n;
                    out.println(ans);
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
                while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
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