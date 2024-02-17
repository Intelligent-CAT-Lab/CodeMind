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
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
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
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
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
                while (Character.isWhitespace(b)) {
                    b = input.read();
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
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
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