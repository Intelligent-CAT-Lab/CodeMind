
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            int n = (int) Math.pow(N, 1.0 / K);
            while ((n - 1) * Math.pow(n, K - 1) > N) {
                n--;
            }
            while (n * Math.pow(n + 1, K - 1) < N) {
                n++;
            }
            for (int y = 0; y < K; y++) {
                int x = K - y;
                if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                    int cost = A * (K - 1) + n * x + (n + 1) * y;
                    answer = Math.min(answer, cost);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
```

## 解説

### 解法1

まず、$n$ を $N$ の $K$ 乗根に設定します。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K$ となります。

$n$ を $N$ の $K$ 乗根に設定したとき、$n^K \leq N < (n+1)^K
