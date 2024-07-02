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
System.out.println("[INST]26;n;s.length();"+n);

            HashMap<Integer, Integer> dp = new HashMap<>();
            dp.put(0, 0);
System.out.println("[INST]29;None;dp.put(0, 0);"+dp.put(0, 0));
            int code = 0;
            int mask = (1 << 26) - 1;
            int last = 0;
            for (char _c : s.toCharArray()) {
System.out.println("[INST]33;None;s.toCharArray();"+s.toCharArray());
                int c = _c - 'a';
                code ^= 1 << c;

                int cdp = Integer.MAX_VALUE;
                if (dp.containsKey(code)) {
System.out.println("[INST]38;None;dp.containsKey(code);"+dp.containsKey(code));
                    cdp = dp.get(code) + 1;
System.out.println("[INST]39;None;dp.get(code);"+dp.get(code));
                }
                for (int i = 0; i < 26; ++i) {
                    int nCode = code ^ (1 << i);
                    if (dp.containsKey(nCode)) {
System.out.println("[INST]43;None;dp.containsKey(nCode);"+dp.containsKey(nCode));
                        cdp = Math.min(cdp, dp.get(nCode) + 1);
System.out.println("[INST]44;cdp;Math.min(cdp, dp.get(nCode) + 1);"+cdp);
System.out.println("[INST]44;None;dp.get(nCode);"+dp.get(nCode));
                    }
                }
                if (!dp.containsKey(code) || cdp < dp.get(code)) {
System.out.println("[INST]47;None;dp.containsKey(code);"+dp.containsKey(code));
System.out.println("[INST]47;None;dp.get(code);"+dp.get(code));
                    dp.put(code, cdp);
System.out.println("[INST]48;None;dp.put(code, cdp);"+dp.put(code, cdp));
                }
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
                res.appendCodePoint(c);
System.out.println("[INST]89;None;res.appendCodePoint(c);"+res.appendCodePoint(c));
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
System.out.println("[INST]93;None;res.toString();"+res.toString());
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

