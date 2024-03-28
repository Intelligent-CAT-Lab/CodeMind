<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 3

Expected output:
-83

```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        long MOD = 1000000007;

        long ans = (pow(2, n, MOD) - modcomb(n, a, MOD) - modcomb(n, b, MOD)) % MOD;
        System.out.println(ans);
    }

    public static long modcomb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, mod - 2, mod);
            cnt %= mod;
        }
        return cnt;
    }

    public static long pow(long base, long exp, long mod) {
        long ans = 1;
        while (exp != 0) {
            if (exp % 2 == 1) {
                ans *= base % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return ans;
    }
}
```</s>
