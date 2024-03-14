<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class COMB_MOD {
    private long[] fac;
    private long[] finv;
    private long[] inv;
    private int max;
    private long mod;

    public COMB_MOD(int max_n, long mod) {
        this.fac = new long[max_n];
        this.finv = new long[max_n];
        this.inv = new long[max_n];
        this.max = max_n;
        this.mod = mod;
        this.init();
    }

    private void init() {
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < this.max; i++) {
            this.fac[i] = this.fac[i - 1] * i % this.mod;
            this.inv[i] = this.mod - this.inv[this.mod % i] * (this.mod / i) % this.mod;
            this.finv[i] = this.finv[i - 1] * this.inv[i] % this.mod;
        }
    }

    public long comb(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.mod) % this.mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        COMB_MOD C = new COMB_MOD(2 * (int) Math.pow(10, 5), mod);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
