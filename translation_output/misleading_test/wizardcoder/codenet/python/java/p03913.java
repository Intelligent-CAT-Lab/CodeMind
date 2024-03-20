Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 1

Expected output:
38

```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N,A = map(int,read().split())

"""
æé©è§£ã®æ§é ãè¦³å¯ããã
ã»æå¾ã®ããã¡ä»¥å¤ã«é¢ãã¦ã¯ããã³ã¹ãn+Aæã£ã¦åçãnåããã
ã»nã¨ãã¦ç¾ããã®ã¯2ç¨®ã¾ã§
ã»çµå±ãnãxåãn+1ãyåã¨ããå½¢ã§ããã©ã¡ã¼ã¿n,x,yã§æ¸ããï¼x\geq 1ã¨ããï¼
ã»æçµææ°ã¯ãn^x(n+1)^yããããNä»¥ä¸ã«ãªã£ã¦æ¬²ãã
ã»ã³ã¹ãã¯ãA(x+y-1) + nx + (n+1)y
ã»x+yãåºå®ãããã¨ã«è§£ã
"""

def F(K):
    # x+y = K
    # n^K <= N < (n+1)^K
    n = int(N**(1/K))
    while (n-1)*n**(K-1) > N:
        n -= 1
    while n * (n+1)**(K-1) < N:
        n += 1
    # n^x(n+1)^y >= N, yãæå°ã«ã¨ããé¢åãªã®ã§å¨æ¢ç´¢
    for y in range(K):
        x = K-y
        if n**x * (n+1)**y >= N:
            break
    cost = A*(K-1) + n*x + (n+1)*y
    return cost

answer = min(F(K) for K in range(1,50))
print(answer)
```

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K <= 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        bw.write(answer + "\n");
        bw.close();
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N, 1.0 / K);
        while ((n-1) * Math.pow(n, K-1) > N) {
            n--;
        }
        while (n * Math.pow(n+1, K-1) < N) {
            n++;
        }
        for (int y = 0; y < K; y++) {
            int x = K-y;
            if (n < 1 || n > N || x < 1 || x > N) {
                continue;
            }
            if (n == 1 && x == 1) {
                return A * (K-1);
            }
            if (n == 1) {
                return A * (K-1) + (K-1) * x;
            }
            if (x == 1) {
                return A * (K-1) + n;
            }
            if (n * Math.pow(x, y) >= N) {
                break;
            }
        }
        return A * (K-1) + n * x + (n+1) * y;
    }
}
```<|endoftext|>
