System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 1

Expected output:
7


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


Answer:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K <= 49; K++) {
            int x = K;
            int y = 0;
            int n = (int) Math.pow(N, 1.0 / K);
            while (Math.pow(n, x) * Math.pow(n + 1, y) < N) {
                if (y == K - 1) {
                    n++;
                    y = 0;
                } else {
                    y++;
                }
            }
            int cost = A * (K - 1) + n * x + (n + 1) * y;
            answer = Math.min(answer, cost);
        }
        System.out.println(answer);
    }
}
<|endoftext|>
