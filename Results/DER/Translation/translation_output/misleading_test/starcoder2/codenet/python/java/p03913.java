

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
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

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N = int(read())

"""
æå¾ã®ããã¡ã¯ããªã³ã¯ã«å¯¾ãã¦ã¯ããªã³ã¯ãæå¤§ã«ãªãã¨ãããã¨ã§
ã»æå°ãªãªã³ã¯ã«å¯¾ãã¦ã¯ããªã³ã¯ãæå°ã«ãªãã¨ãããã¨ã§
ã»æå¤§ãªãªã³ã¯ã«å¯¾ãã¦ã¯ããªã³ã¯ãæå¤§ã«ãªãã¨ãããã¨ã§
ã»æå°ãªãªã³ã¯ã«å¯¾ãã¦ã¯ããªã³ã¯ãæå°ã«ãªãã¨ãããã¨ã§
ã»æå¤§ãªãªã³ã¯ã«å¯¾ãã¦ã¯ããªã³ã¯ãæå¤§ã
