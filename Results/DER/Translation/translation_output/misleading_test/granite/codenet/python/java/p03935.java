System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7

Expected output:
81

```
def f(n):
	i=e=[1,0,0,1];z=[1,1,1,0]
	while n:e=[e,g(e,z)][n%2];z=g(z,z);n//=2
	return e[1]
M=998244353;g=lambda a,b:[(a[0]*b[0]+a[1]*b[2])%M,(a[0]*b[1]+a[1]*b[3])%M,(a[2]*b[0]+a[3]*b[2])%M,(a[2]*b[1]+a[3]*b[3])%M];n,m=map(int,input().split());I=[1,1];r=f(m+2*n-2);c=1
for i in range(2,n):I+=[(M-M//i)*I[M%i]%M]
for i in range(n-1):r=(r+c*(M-f(2*n-2-2*i)))%M;c=c*(m+i)*I[i+1]%M
print(r)
```


Answer:
```java
import java.util.*;

public class Main {
    static int M = 998244353;
    static long[][] mul(long[][] a, long[][] b) {
        long[][] c = new long[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % M;
                }
            }
        }
        return c;
    }
    static long[][] pow(long[][] a, long n) {
        long[][] res = new long[4][4];
        for (int i = 0; i < 4; i++) {
            res[i][i] = 1;
        }
        while (n > 0) {
            if (n % 2 == 1) {
                res = mul(res, a);
            }
            a = mul(a, a);
            n /= 2;
        }
        return res;
    }
    static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        long[][] a = new long[4][4];
        a[0][0] = a[0][1] = a[1][0] = a[2][1] = a[3][2] = 1;
        a = pow(a, n - 1);
        return a[1][0];
    }
    static long modInv(long a) {
        return pow(a, M - 2);
    }
    static long comb(long n, long k) {
        if (k > n) {
            return 0;
        }
        long[] fact = new long[(int) n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % M;
        }
        return fact[(int) n] * modInv(fact[(int) k]) % M * modInv(fact[(int) (n - k)]) % M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = fib(m + 2 * n - 2);
        long[] inv = new long[n];
        inv[0] = 1;
        for (int i = 1; i < n; i++) {
            inv[i] = (M - M / i) * inv[M % i] % M;
        }
        long c = 1;
        for (int i = 2; i < n; i++) {
            ans = (ans + c * (M - fib(2 * n - 2 - 2 * (i - 1)))) % M;
            c = c * (m + i - 1) % M * inv[i] % M;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
