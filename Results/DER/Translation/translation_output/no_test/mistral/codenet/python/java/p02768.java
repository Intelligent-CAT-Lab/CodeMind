<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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

        long X = (long) Math.pow(2, n, MOD) - 1;
        long A = modcomb(n, a, MOD);
        long B = modcomb(n, b, MOD);
        long ans = (X - A - B) % MOD;
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

    public static long pow(long x, long y, long mod) {
        long res = 1;
        while (y != 0) {
            if (y % 2 == 1) {
                res *= x % mod;
            }
            x = (x * x) % mod;
            y /= 2;
        }
        return res;
    }
}
```</s>
