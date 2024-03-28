<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
7


```
N = int(input())

nn = N + 10
P = 998244353

fa = [1] * (nn+1)
fainv = [1] * (nn+1)
for i in range(nn):
    fa[i+1] = fa[i] * (i+1) % P
fainv[-1] = pow(fa[-1], P-2, P)
for i in range(nn)[::-1]:
    fainv[i] = fainv[i+1] * (i+1) % P
C = lambda a, b: fa[a] * fainv[b] % P * fainv[a-b] % P if 0 <= b <= a else 0

ans = pow(3, N, P)
for i in range(N//2 + 1, N + 1):
    ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int P = 998244353;

        int[] fa = new int[N+10];
        int[] fainv = new int[N+10];
        fa[0] = 1;
        fainv[0] = 1;
        for (int i = 0; i < N; i++) {
            fa[i+1] = fa[i] * (i+1) % P;
        }
        fainv[N] = pow(fa[N], P-2, P);
        for (int i = N-1; i >= 0; i--) {
            fainv[i] = fainv[i+1] * (i+1) % P;
        }
        int C(int a, int b) {
            if (b < 0 || b > a) return 0;
            return fa[a] * fainv[b] % P * fainv[a-b] % P;
        }

        int ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
