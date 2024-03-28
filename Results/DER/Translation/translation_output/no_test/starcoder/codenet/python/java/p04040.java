<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        int[][] dp = new int[h+1][w+1];
        dp[0][0] = 1;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % mod;
            }
        }
        int ans = 0;
        for(int i = 0; i < h-a; i++) {
            for(int j = 0; j < w-b; j++) {
                ans = (ans + dp[i][j] * dp[i+a][j+b]) % mod;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
