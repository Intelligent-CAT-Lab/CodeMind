import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "Brown" : "Alice"));}

    boolean[][] dp = new boolean[100][100], visited = new boolean[100][100];

    //System.out.println();はつかわない！！
    void solve() throws Exception{
        long X = in.nextLong(), Y = in.nextLong();
        /*
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                boolean b = dfs(i, j);
                out.print((b ? "O" : "X") + " ");
            }
            out.println();
        }
        */

        printlnYN(Math.abs(X-Y) <= 1);
System.out.println("[INST]29;None;Math.abs(X-Y);"+Math.abs(X-Y));
    }

    boolean dfs(int x, int y){
        if(visited[x][y]) return dp[x][y];
        if(x <= 1 && y <= 1){
            dp[x][y] = false;
            visited[x][y] = true;
            return false;
        }

        for(int i = 2; i <= x; i += 2){
            if(!dfs(x-i, y+i/2)){
                dp[x][y] = true;
                visited[x][y] = true;
                return true;
            }
        }

        for(int i = 2; i <= y; i += 2){
            if(!dfs(x+i/2, y-i)){
                dp[x][y] = true;
                visited[x][y] = true;
                return true;
            }
        }

        dp[x][y] = false;
        visited[x][y] = true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
System.out.println("[INST]67;None;out.flush();"+out.flush());
    }

    class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
System.out.println("[INST]81;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]83;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]87;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]89;b;input.read();"+b);
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]93;b;input.read();"+b);
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
System.out.println("[INST]107;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]109;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]113;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]115;b;input.read();"+b);
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]119;b;input.read();"+b);
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
System.out.println("[INST]126;b;input.read();"+b);
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
System.out.println("[INST]131;b;input.read();"+b);
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
System.out.println("[INST]142;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]143;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]144;b;input.read();"+b);
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
System.out.println("[INST]156;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]157;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]158;b;input.read();"+b);
                }
                while (b != -1 && !Character.isWhitespace(b)) {
System.out.println("[INST]160;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    sb.append((char) b);
System.out.println("[INST]161;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]162;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]164;None;sb.toString();"+sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}
/* end Main */