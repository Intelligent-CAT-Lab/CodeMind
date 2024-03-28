```java
import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    static final int MOD = 1_000_000_007;

    static int main(int N, int K) {
        K--;
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < C[n].length; i++) {
                C[n][i] = C[n - 1][i];
            }
            for (int i = 1; i < C[n].length; i++) {
                C[n][i] += C[n - 1][i - 1];
                C[n][i] %= MOD;
            }
        }

        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N + 9; n > 0; n--) {
            dp[n][n] -= dp[n - 1][n];
            dp[n][n] %= MOD;
        }

        long ans = 0;
        if (K == N - 1) {
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += dp[i][N - 1];
                sum %= MOD;
            }
            return (int) sum;
        }

        for (int r = N - K; r < N + 1; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = (x * sum(dp, a) % MOD) % MOD;
            } else {
                x *= sum(dp, a + 1) * sum(C, b - 1, a + b - 1, b - 1, true) % MOD;
                x %= MOD;
            }
            ans += x;
        }

        ans %= MOD;
        for (int i = 0; i < N - K - 2; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int) ans;
    }

    static long sum(long[][] arr, int end) {
        long sum = 0;
        for (int i = 0; i <= end; i++) {
            sum += arr[i][end];
            sum %= MOD;
        }
        return sum;
    }

    static long sum(long[][] arr, int start, int end, int col, boolean reverse) {
        long sum = 0;
        if (!reverse) {
            for (int i = start; i <= end; i++) {
                sum += arr[i][col];
                sum %= MOD;
            }
        } else {
            for (int i = end; i >= start; i--) {
                sum += arr[i][col];
                sum %= MOD;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        Reader input = new Reader();
        int N = input.nextInt();
        int K = input.nextInt();
        System.out.println(main(N, K));
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        public byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, 0, BUFFER_SIZE);
            bufferPointer = 0;
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }
    }
}
```

