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
    }

    static boolean isOK(String prefix, int x, int y, int z) {
        int prefixState = 0;
        for (int i = 1 ; i< prefix.length() ; i++) {
            String l = prefix.substring(i, prefix.length());
            if (prefix.startsWith(l)) {
                prefixState = Math.max(prefixState, l.length());
            } else {
                if (l.compareTo(prefix) < 0) {
                    // muri
                    return false;
                }
            }
        }

        int n = prefix.length();
        int[][] stateTable = new int[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                String s = prefix.substring(0, i) + (char)('a' + j);
                if (prefix.startsWith(s)) {
                    stateTable[i][j] = (s.length() == n) ? 0 : s.length();
                } else if (s.compareTo(prefix) < 0) {
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
            if ((i == 0 || pref.compareTo(prefix) > 0) && dp[0][0][0][i] == 1) {
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
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
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