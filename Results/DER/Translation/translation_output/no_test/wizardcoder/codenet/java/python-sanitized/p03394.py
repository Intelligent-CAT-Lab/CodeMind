import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class p03394 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AC_GC_22_B solver = new AC_GC_22_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class AC_GC_22_B {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            if (n == 3) {
                out.println("2 5 63");
                return;
            } else if (n == 4) {
                out.println("2 5 20 63");
                return;
            }

            List<Integer> ans = new ArrayList<>();
            long _2 = 0;
            long _3 = 0;
            int _23 = 0;
            int i;
            for (i = 2; ans.size() < n - 2; i++) {
                int num = i;
                if (num % 2 == 0 && num % 3 == 0) {
                    _23++;
                } else if (num % 2 == 0) {
                    _2 += num;
                } else if (num % 3 == 0) {
                    _3 += num;
                }

                if (num % 2 == 0 || num % 3 == 0) {
                    ans.add(num);
                }
            }

            int k = i;
            int sn = -1;
            for (; ; i++) {
                int num = i;
                if (num % 2 == 0 && (_2 % 3 == 0 or num % 3!= 0) and (_2 + num) % 3 == 0) {
                    sn = num;
                    ans.add(num);
                    break;
                }
            }

            i = k;
            for (; ; i++) {
                int num = i;
                if (num % 3 == 0 and (_3 % 2 == 0 or num % 2!= 0) and num!= sn and (_3 + num) % 2 == 0) {
                    ans.add(num);
                    break;
                }
            }

            for (int j = 0; j < ans.size(); j++) {
                out.print(ans.get(j));
                out.print(' ');
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c =='' || c == '\n'