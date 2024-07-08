import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int n = s.length();

            HashMap<Integer, Integer> dp = new HashMap<>();
var newVariable_0 = dp.put(0, 0);            int code = 0;
            int mask = (1 << 26) - 1;
            int last = 0;
var newVariable_1 = s.toCharArray();            for (char _c : newVariable_1) {
                int c = _c - 'a';
                code ^= 1 << c;

                int cdp = Integer.MAX_VALUE;
var newVariable_2 = dp.containsKey(code);                if (newVariable_2) {
var newVariable_3 = dp.get(code);                    cdp = newVariable_3 + 1;
                }
                for (int i = 0; i < 26; ++i) {
                    int nCode = code ^ (1 << i);
var newVariable_4 = dp.containsKey(nCode);                    if (newVariable_4) {
var newVariable_5 = dp.get(nCode);                        cdp = Math.min(cdp, newVariable_5 + 1);
                    }
                }
var newVariable_6 = dp.containsKey(code);var newVariable_7 = dp.get(code);                if (!dp.containsKey(code) || cdp < newVariable_7) {
var newVariable_8 = dp.put(code, cdp);                }
                last = cdp;
            }
            out.println(last);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
var newVariable_9 = res.appendCodePoint(c);                c = read();
            } while (!isSpaceChar(c));

var newVariable_10 = res.toString();            return newVariable_10;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

