<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    static final long P = 998244353;
    static long[] fa, fainv;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % P;
            a = a * a % P;
            b >>= 1;
        }
        return res;
    }

    static long C(int a, int b) {
        if (b > a || b < 0)
            return 0;
        return fa[a] * fainv[b] % P * fainv[a - b] % P;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        fa = new long[nn + 1];
        fainv = new long[nn + 1];
        fa[0] = fainv[0] = 1;
        for (int i = 1; i <= nn; i++)
            fa[i] = fa[i - 1] * i % P;
        fainv[nn] = pow(fa[nn], P - 2);
        for (int i = nn - 1; i >= 0; i--)
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        long ans = pow(3, N);
        for (int i = N / 2 + 1; i <= N; i++)
            ans = (ans - 2 * C(N, i) * pow(2, N - i)) % P;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the factorial and its inverse, and then calculates the binomial coefficient and the power of 2. The result is printed to the standard output.<｜end▁of▁sentence｜>
