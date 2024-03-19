<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[1000][1000];
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int m0 = Integer.parseInt(br.readLine());
        int md = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int nd = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        int[] S = new int[M+1];
        S[0] = m0;
        for (int i = 1; i <= M; i++) {
            S[i] = (S[i-1] * 58 + md) % (N+1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i+1] += S[i];
        }
        int[] T = new int[N+1];
        T[0] = n0;
        for (int i = 1; i <= N; i++) {
            T[i] = (T[i-1] * 58 + nd) % (M+1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i+1] += T[i];
        }
        List<Long> gen = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                long val = (long) (M - i) * (N - j) + S[i] + T[j];
                gen.add(val);
            }
        }
        Collections.sort(gen);
        out.println(gen.get(0));
        out.flush();
    }
}
```</s>
