System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
rown

```
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class p03742 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b? "Brown" : "Alice"));}

    boolean[][] dp = new boolean[100][100], visited = new boolean[100][100];

    //System.out.println();ã¯ã¤ãããªãï¼ï¼
    void solve() throws Exception{
        long X = in.nextLong(), Y = in.nextLong();
        /*
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                boolean b = dfs(i, j);
                out.print((b? "O" : "X") + " ");
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
        new p03742().m();
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
                while ((b < '0' || '9' < b) && b!= '-' && b!= '+') {
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
                while ((b < '0' || '9' < b) && b!= '-' && b!= '+') {
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
                if (b!= '.') return sign * ret;
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
                while (b!= -1 &&!Character.isWhitespace(b)) {
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
/* end p03742 */
```


Answer:
Here's the Python code for the given Java code:

```python
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class p03742 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b? "Brown" : "Alice"));}

    boolean[][] dp = [[False for _ in range(101)] for _ in range(101)], visited = [[False for _ in range(101)] for _ in range(101)]

    #System.out.println();ã¯ã¤ãããªãï¼ï¼
    def solve(self):
        X, Y = map(int, input().split())
        #for i in range(11):
        #    for j in range(11):
        #        print("O" if self.dfs(i, j) else "X", end=" ")
        #    print()
        print("Brown" if abs(X-Y) <= 1 else "Alice")

    def dfs(self, x, y):
        if self.visited[x][y]: return self.dp[x][y]
        if x <= 1 and y <= 1:
            self.dp[x][y] = False
            self.visited[x][y] = True
            return False
        for i in range(2, x+1, 2):
            if not self.dfs(x-i, y+i//2):
                self.dp[x][y] = True
                self.visited[x][y] = True
                return True
        for i in range(2, y+1, 2):
            if not self.dfs(x+i//2, y-i):
                self.dp[x][y] = True
                self.visited[x][y] = True
                return True
        self.dp[x][y] = False
        self.visited[x][y] = True
        return False

    public static void main(String[] args) throws Exception {
        new p03742().m();
    }

    void m() throws Exception {
        self.solve()
        self.out.flush()

    class FastScanner {
        Reader input;

        FastScanner() {self(System.in);}
        FastScanner(InputStream stream) {self.input = BufferedReader(InputStreamReader(stream));}

        int nextInt(self):
            try:
                sign = 1
                b = self.input.read()
                while (b < '0' or '9' < b) and b!= '-' and b!= '+':
                    b = self.input.read()
                if b == '-':
                    sign = -1
                    b = self.input.read()
                elif b == '+':
                    b = self.input.read()
                ret = b - '0'
                while True:
                    b = self.input.read()
                    if b < '0' or '9' < b:
                        return ret * sign
                    ret *= 10
                    ret += b - '0'
            except IOException:
                e.printStackTrace()
                return -1

        def nextLong(self):
            try:
                sign = 1
                b = self.input.read()
                while (b < '0' or '9' < b) and b!= '-' and b!= '+':
                    b = self.input.read()
                if b == '-':
                    sign = -1
                    b = self.input.read()
                elif b == '+':
                    b = self.input.read()
                ret = b - '0'
                while True:
                    b = self.input.read()
                    if b < '0' or '9' < b:
                        break
                    ret *= 10
                    ret += b - '0'
                if b!= '.':
                    return ret * sign
                div = 1
                b = self.input.read()
                while '0' <= b and b <= '9':
                    ret *= 10
                    ret += b - '0'
                    div *= 10
                    b = self.input.read()
                return ret * sign / div
            except IOException:
                e.printStackTrace()
                return Double.NaN

        def nextChar(self):
            try:
                b = self.input.read()
                while Character.isWhitespace(b):
                    b = self.input.read()
                return (char) b
            except IOException:
                e.printStackTrace()
                return 0

        def nextStr(self):
            try:
                sb = StringBuilder()
                b = self.input.read()
                while Character.isWhitespace(b):
                    b = self.input.read()
                while b!= -1 and not Character.isWhitespace(b):
                    sb.append((char) b)
                    b = self.input.read()
                return sb.toString()
            except IOException:
                e.printStackTrace()
                return ""

        def nextIntArray(self, n):
            res = [0] * n
            for i in range(n):
                res[i] = nextInt()
            return res

        def nextIntArrayDec(self, n):
            res = [0] * n
            for i in range(n):
                res[i] = nextInt() - 1
            return res

        def nextIntArray1Index(self, n):
            res = [0] * (n + 1)
            for i in range(n):
                res[i + 1] = nextInt()
            return res

        def nextLongArray(self, n):
            res = [0] * n
            for i in range(n):
                res[i] = nextLong()
            return res

        def nextLongArrayDec(self, n):
            res = [0] * n
            for i in range(n):
                res[i] = nextLong() - 1
            return res

        def nextLongArray1Index(self, n):
            res = [0] * (n + 1)
            for i in range(n):
                res[i + 1] = nextLong()
            return res

        def nextDoubleArray(self, n):
            res = [0.0] * n
            for i in range(n):
                res[i] = nextDouble()
            return res
}
```<|endoftext|>
