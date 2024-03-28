<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
81

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
        int P = 998244353;
        int[] fa = new int[nn + 1];
        int[] fainv = new int[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (fa[i] * (i + 1)) % P;
        }
        fainv[nn - 1] = (int) Math.pow(fa[nn - 1], P - 2, P);
        for (int i = nn - 2; i >= 0; i--) {
            fainv[i] = (fainv[i + 1] * (i + 1)) % P;
        }
        int ans = (int) Math.pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * (int) Math.pow(2, N - i, P)) % P;
        }
        System.out.println(ans);
    }

    public static int C(int a, int b) {
        if (b <= a) {
            return (fa[a] * fainv[b] % P * fainv[a - b] % P);
        } else {
            return 0;
        }
    }
}
```
Note: The code uses the `Math.pow()` method to calculate the power of 3 and 2, which is not the most efficient way to do it in Java. A more efficient way would be to use the `Math.pow()` method with the `int` type, like this: `Math.pow(3, N, P)` and `Math.pow(2, N - i, P)`.</s>
