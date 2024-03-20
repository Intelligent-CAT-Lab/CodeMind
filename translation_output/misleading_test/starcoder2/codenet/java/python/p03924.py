
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    MOD = 1000000007
    dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N+1):
            for k in range(N+1):
                if j != N:
                    dp[i+1][j+1][k] += (dp[i][j][k] * (N-j)) % MOD
                    dp[i+1][j+1][k] %= MOD
                dp[i+1][j][k] += (dp[i][j][k] * (j-k)) % MOD
                dp[i+1][j][k] %= MOD
                dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
                dp[i+1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == '__main__':
    main()
```

## p03925

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
91

```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p03925 {
    public static void main(String[] args) {
        FS r = new FS();
        int N = r.nextInt();
        int M = r.nextInt();
        int MOD = 1000000007;
        // dp[days][added town][looped size]
        int[][][] dp = new int[M+1][N+1][N+1];
        dp[0][1][1] = 1;
        for(int i=0; i<M; i++) {
            for(int j=0; j<=N; j++) {
                for(int k=0; k<=N; k++) {
                    // add town unused
                    if(j!=N) {
                        dp[i+1][j+1][k] += (int)(((long)dp[i][j][k]*(N-j))%MOD);
                        dp[i+1][j+1][k] %= MOD;
                    }
                    // add town used but not in loop
                    dp[i+1][j][k] += (int)(((long)dp[i][j][k]*(j-k))%MOD);
                    dp[i+1][j][k] %= MOD;
                    // add town used and in loop
                    dp[i+1][j][j] += (int)(((long)dp[i][j][k]*k)%MOD);
                    dp[i+1][j][j] %= MOD;
                }
            }
        }
        System.out.println(dp[M][N][N]);
    }

    // Read Class
    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b
