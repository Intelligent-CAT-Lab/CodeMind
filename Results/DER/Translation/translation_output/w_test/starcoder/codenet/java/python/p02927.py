<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 40

Expected output:
10


```
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class p02927 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b? "Yes" : "No"));}

    void solve() throws Exception{
        int M = in.nextInt(), D = in.nextInt();
        int ans = 0;
        for(int m = 1; m <= M; m++){
            for(int d = 1; d <= D; d++){
                int d1 = d % 10, d2 = d / 10;
                if(d1 >= 2 && d2 >= 2 && d1 * d2 == m) ans++;
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        new p02927().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    static class FastScanner {
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

        public Long[] nextWrapperLongArray(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public Long[] nextWrapperLongArrayDec(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public Long[] nextWrapperLongArray1Index(int n) {
            Long[] res = new Long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
    }
}
/* end p02927 */
```

python code:<fim_suffix><fim_middle>

```python
import sys

class p02927:
    def __init__(self):
        self.in_ = self.InStream()
        self.out_ = self.OutStream()
        self.MOD = 1000000007
        self.ans = 0

    def solve(self):
        M = self.in_.nextInt()
        D = self.in_.nextInt()
        for m in range(1, M+1):
            for d in range(1, D+1):
                d1 = d % 10
                d2 = d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                    self.ans += 1

    def m(self):
        self.solve()
        self.out_.println(self.ans)

    class InStream:
        def __init__(self):
            self.buf = sys.stdin.buffer
            self.off = 0
            self.end = 0

        def read(self):
            if self.off >= self.end:
                self.off = 0
                self.end = self.buf.read(4096).find(b'\n')
                if self.end == -1:
                    self.end = self.buf.read(4096).find(b'')
                    if self.end == -1:
                        return -1
            ret = self.buf[self.off]
            self.off += 1
            return ret

        def readInt(self):
            ret = 0
            neg = False
            b = self.read()
            while b!= -1 and b < ord('0') and b!= ord('-'):
                b = self.read()
            if b == ord('-'):
                neg = True
                b = self.read()
            while b!= -1 and b >= ord('0') and b <= ord('9'):
                ret = ret * 10 + b - ord('0')
                b = self.read()
            return -ret if neg else ret

        def readLong(self):
            ret = 0
            neg = False
            b = self.read()
           
