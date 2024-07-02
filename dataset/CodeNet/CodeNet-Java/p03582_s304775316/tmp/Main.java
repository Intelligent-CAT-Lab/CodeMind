// package other2017.codefestival2017.qualb;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int n = x + y + z;

        String ans = "";
        for (int i = 0; i < n ; i++) {
            if (z >= 1 && isOK(ans + "c", x, y, z-1)) {
                z--;
                ans += "c";
            } else if (y >= 1 && isOK(ans + "b", x, y-1, z)) {
                y--;
                ans += "b";
            } else {
                x--;
                ans += "a";
            }
        }
        out.println(ans);
        out.flush();
System.out.println("[INST]32;None;out.flush();"+out.flush());
    }

    static boolean isOK(String prefix, int x, int y, int z) {
        int prefixState = 0;
        for (int i = 1 ; i< prefix.length() ; i++) {
System.out.println("[INST]37;None;prefix.length();"+prefix.length());
            String l = prefix.substring(i, prefix.length());
System.out.println("[INST]38;l;prefix.substring(i, prefix.length());"+l);
System.out.println("[INST]38;None;prefix.length();"+prefix.length());
            if (prefix.startsWith(l)) {
System.out.println("[INST]39;None;prefix.startsWith(l);"+prefix.startsWith(l));
                prefixState = Math.max(prefixState, l.length());
System.out.println("[INST]40;prefixState;Math.max(prefixState, l.length());"+prefixState);
System.out.println("[INST]40;None;l.length();"+l.length());
            } else {
                if (l.compareTo(prefix) < 0) {
System.out.println("[INST]42;None;l.compareTo(prefix);"+l.compareTo(prefix));
                    // muri
                    return false;
                }
            }
        }

        int n = prefix.length();
System.out.println("[INST]49;n;prefix.length();"+n);
        int[][] stateTable = new int[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                String s = prefix.substring(0, i) + (char)('a' + j);
System.out.println("[INST]53;None;prefix.substring(0, i);"+prefix.substring(0, i));
                if (prefix.startsWith(s)) {
System.out.println("[INST]54;None;prefix.startsWith(s);"+prefix.startsWith(s));
                    stateTable[i][j] = (s.length() == n) ? 0 : s.length();
System.out.println("[INST]55;None;s.length();"+s.length());
System.out.println("[INST]55;None;s.length();"+s.length());
                } else if (s.compareTo(prefix) < 0) {
System.out.println("[INST]56;None;s.compareTo(prefix);"+s.compareTo(prefix));
                    stateTable[i][j] = -1;
                } else {
                    stateTable[i][j] = 0;
                }
            }
        }

        int L = x+y+z;
        int[][][][] dp = new int[L+1][y+1][z+1][n+1];
        dp[L][y][z][prefixState] = 1;
        for (int i = L ; i >= 1 ; i--) {
            for (int b = 0 ; b <= y ; b++) {
                for (int c = 0 ; c <= z ; c++) {
                    int a = i-b-c;
                    int[] left = {a, b, c};
                    for (int s = 0 ; s <= n ; s++) {
                        if (dp[i][b][c][s] == 0) {
                            continue;
                        }
                        for (int u = 0 ; u <= 2 ; u++) {
                            if (stateTable[s][u] == -1 || left[u] == 0) {
                                continue;
                            }
                            dp[i-1][b-((u==1)?1:0)][c-((u==2)?1:0)][stateTable[s][u]] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0 ; i <= n ; i++) {
            String pref = prefix.substring(0, i) + prefix;
System.out.println("[INST]88;None;prefix.substring(0, i);"+prefix.substring(0, i));
            if ((i == 0 || pref.compareTo(prefix) > 0) && dp[0][0][0][i] == 1) {
System.out.println("[INST]89;None;pref.compareTo(prefix);"+pref.compareTo(prefix));
                return true;
            }
        }
        return false;
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
System.out.println("[INST]118;numChars;stream.read(buf);"+numChars);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
System.out.println("[INST]136;None;res.append((char) c);"+res.append((char) c));
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
System.out.println("[INST]139;None;res.toString();"+res.toString());
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}