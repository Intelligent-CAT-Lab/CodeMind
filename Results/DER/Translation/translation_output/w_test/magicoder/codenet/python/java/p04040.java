<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
2


```
class COMB_MOD():
    # http://drken1215.hatenablog.com/entry/2018/06/08/210000
    def __init__(self, max_n=510000, mod=10**9+7):
        self.fac = [0]*max_n
        self.finv = [0]*max_n
        self.inv = [0]*max_n
        self.fac[0] = self.fac[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        self.max = max_n
        self.mod = mod
        self._maesyori()

    def _maesyori(self):
        for i in range(2,self.max):
            self.fac[i] = self.fac[i-1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i-1] * self.inv[i] % self.mod

    def comb(self, n, k):
        if n < k : return 0
        if n < 0 or k < 0:return 0
        return self.fac[n] * (self.finv[k] * self.finv[n-k] % self.mod) % self.mod
mod = 10**9 + 7
h,w,a,b = map(int,input().split())
C = COMB_MOD(max_n=2*10**5)
ans = 0
for i in range(h-a):
    ans = (ans + C.comb(b-1+i,i)*C.comb(h-1-i+w-1-b,h-1-i))%mod
print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    static long mod = 1000000007;
    static long[] fac = new long[200005];
    static long[] finv = new long[200005];
    static long[] inv = new long[200005];

    static void maesyori(int max) {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < max; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    static long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        maesyori(200005);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + comb(b - 1 + i, i) * comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It calculates the combination modulo a large prime number (10^9 + 7) and then uses it to calculate the number of ways to place a certain number of bishops on a chessboard.<｜end▁of▁sentence｜>
