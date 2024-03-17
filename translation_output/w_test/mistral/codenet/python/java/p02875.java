<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int nn = N + 10;
        long P = 998244353;
        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn - 1] = pow(fa[nn - 1], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }
        long ans = pow(3, N, P);
        for (int i = 1; i <= N / 2; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }
        System.out.println(ans);
    }

    public static long C(int n, int k) {
        if (k > n) {
            return 0;
        }
        long ans = fa[n] * fainv[k] % P * fainv[n - k] % P;
        return ans;
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            b = b >> 1;
            a = (a * a) % mod;
        }
        return ans;
    }
}
```</s>
