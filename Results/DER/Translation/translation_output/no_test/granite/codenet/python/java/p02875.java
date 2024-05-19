System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        int P = 998244353;

        long[] fa = new long[nn+1];
        long[] fainv = new long[nn+1];
        fa[0] = 1;
        fainv[0] = 1;
        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i-1] * i % P;
        }
        fainv[nn] = pow(fa[nn], P-2, P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = fainv[i+1] * (i+1) % P;
        }
        long C(int a, int b) {
            if (b < 0 || b > a) return 0;
            return fa[a] * fainv[b] % P * fainv[a-b] % P;
        }

        long ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }

    public static long pow(long a, long n, int mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = res * a % mod;
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }
}
```<|endoftext|>
