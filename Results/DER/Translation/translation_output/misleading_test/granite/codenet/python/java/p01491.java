System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 3 1 0

Expected output:
-33

```
import sys
readline = sys.stdin.readline
write = sys.stdout.write
def solve():
    M, N, m0, md, n0, nd = map(int, readline().split())

    S = [0]*(M+1)
    S[0] = mi = m0
    for i in range(1, M):
        S[i] = mi = (mi * 58 + md) % (N + 1)
    S.sort()
    for i in range(M):
        S[i+1] += S[i]

    T = [0]*(N+1)
    T[0] = ni = n0
    for i in range(1, N):
        T[i] = ni = (ni * 58 + nd) % (M + 1)
    T.sort()
    for i in range(N):
        T[i+1] += T[i]

    def gen():
        def calc(a, b):
            return (M - a)*(N - b) + S[a] + T[b]
        yield 10**18
        j = N
        for i in range(M+1):
            while j > 0 and calc(i, j) > calc(i, j-1):
                j -= 1
            yield calc(i, j)
    write("%d\n" % min(gen()))
solve()

```


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        long[] S = new long[M+1];
        long mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            mi = (mi * 58 + md) % (N + 1);
            S[i] = mi;
        }
        Arrays.sort(S);
        for (int i = 1; i < M; i++) {
            S[i] += S[i-1];
        }

        long[] T = new long[N+1];
        long ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            ni = (ni * 58 + nd) % (M + 1);
            T[i] = ni;
        }
        Arrays.sort(T);
        for (int i = 1; i < N; i++) {
            T[i] += T[i-1];
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i <= M; i++) {
            int j = Arrays.binarySearch(T, (M - i) * (N + 1) - S[i]);
            if (j < 0) {
                j = -j - 1;
            }
            min = Math.min(min, (M - i) * (N - j) + S[i] + T[j]);
        }
        System.out.println(min);
    }
}
```<|endoftext|>
