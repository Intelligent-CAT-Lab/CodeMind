System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
-64

```

"""
Writer: SPD_9X2
https://atcoder.jp/contests/tenka1-2019/tasks/tenka1_2019_f
Xãå¶æ°ãå¥æ°ãã¯éè¦ãªæ°ããã
é·ãL(<=N)ã®1,2ã§æ§æãããæå­åã®åé¡ãã«å¤æã§ãã
O(L)ã§æ±ãããã°ãï½
dpãï¼

X == 1ãªãã0,2ã®ã¿ã§æ§æããã¦ãã°ãï½
X == 2ãªãã1ã2ã¤ä»¥ä¸å¥ã£ã¦ãããä¸å¯è½ 0 & 1ã1ã¤ã¾ã§
X == 3ãªãã2ãå¥ããå ´åâ1ã¯å¥ããããªããã2ãå¥½ããªã ãå¥ãã¦ãã
            å¥ããªãå ´åâ1ã2åã¾ã§å¥ãããã
X == 4ãªãã

âãã¯ãå¶å¥ãéè¦ãï¼

ã¨ã©ãå ´åã¯ X-1ãâ X+1ã®ç§»åã¯å¼·å¶
ããªãã¡ åº§æ¨1ã«è¡ã£ã¦ã¯ãããªã
åæã¯2ã«è¡ããããªã
åæ§ã«X+2ã«ã¯è¡ããªã
X+3ã«è¡ããããªã
3ã«ã¯è¡ããªããã4ã«è¡ããããªã
ã¤ã¾ã2ä»¥å¤ä¸å¯ï¼ï¼ 

ç¡éã«ç§»åãç¶ããå ´åã¯å°ãªãã¨ãX=å¥æ° 2ã®ã¿ä»¥å¤ç¡ç
å¶æ°ã®å ´åã¯Xä»¥åã«å¥æ°å1ãã¯ããå¿è¦ãã
aâa+1ã¨ç§»åããã¨ãX+a-1ããåã¯ç§»åã§ããªããªã

ãã£ã¦2Xã¯çµ¶å¯¾è¶ããããªã
ãã¨ã¯æ°ãä¸ãã«ã©ããã£ã¦è½ã¨ãã
Lã¯åºå®ã§ããã¨æããã ããª
O(L)ã§è§£ããã°åã¡

dp?
ç·åã§å ´ååã or Lã§å ´ååã
ç·åã§å ´ååãããå ´åãå½ç¶Lã¯ç°ãªãã®ã§ã¾ã¨ããå¿è¦ããã
Lã®é·ãã®ç§»åã®å¯ä¸ã«ã¯NCLãæããå¿è¦ããã
ç§»åããã¨ãã«Lã¯1å¢ãããã ããªâ¦
nC(l+1) = nCl * (n-l)/(l+1)
ç§»åå¦çãä¸æ°ã«è¡ãã°lã¯çµ±ä¸ã§ãããããï½ï¼

ç·åSã¯Xä»¥ä¸ã®å ´å X+1+2kããããããªã
S-Xä»¥åã¯2ã®ã¿é²è»å¯è½ãä»¥éã¯èªç±

å¯¾ç§°æ§ï¼
1ã¨2ã®æ°ãå¨æ¢ç´¢ï¼ ãªãã°O(N**2)ã§ããã
1ãAå,2ãBåã®æãæåã¨æå¾ã«2ãããã¤ãç½®ãå¿è¦ããã
âå¾ã¯æ®ãã®ä½ç½®ãã1ãç½®ãå ´æãé¸ã¹ã°ãã

âè§£ããã£ã½ãï¼

å ´ååãé å¼µãã

åè¨ãXä»¥ä¸ã®å ´åâå®å¨ã«èªç±
åè¨ã2Xä»¥ä¸ã®å ´åâXãå¥æ°ã®å ´åã®ã¿ all2ãå¯è½ãããä»¥å¤ã¯æ­»
Xä»¥ä¸2Xä»¥ä¸ã®å ´å
â
    S-Xãå¥æ°ã§ããå¿è¦ãã
    ã¾ã2ã(S-X+1)ãæ¶è²»ããï¼åå¾ã«ç½®ãåï¼
    ãã¨ã¯èªç±ã«é åãä½ã£ã¦ã©ãã
    
"""

def modfac(n, MOD):
 
    f = 1
    factorials = [1]
    for m in range(1, n + 1):
        f *= m
        f %= MOD
        factorials.append(f)
    inv = pow(f, MOD - 2, MOD)
    invs = [1] * (n + 1)
    invs[n] = inv
    for m in range(n, 1, -1):
        inv *= m
        inv %= MOD
        invs[m - 1] = inv
    return factorials, invs


def modnCr(n,r,mod,fac,inv): #ä¸ã§æ±ããfacã¨invsãå¼æ°ã«å¥ããã¹ã(ä¸ã®é¢æ°ã§ä¸ããnãè¨ç®ã§ããæå¤§ã®nã«ãªã)

    return fac[n] * inv[n-r] * inv[r] % mod


N,X = map(int,input().split())

mod = 998244353
fac,inv = modfac(N+10,mod)
ans = 0

for two in range(N+1):

    for one in range(N+1):

        if one + two > N:
            break
        
        dist = one + two*2
        zero = modnCr(N,one+two,mod,fac,inv)
        now = 0

        if dist < X:
            now = modnCr(one+two,one,mod,fac,inv) * zero
        elif dist == X:
            continue
        elif dist < 2*X:
            if (dist-X) % 2 == 0:
                continue
            dtwo = two - (dist-X+1)
            if dtwo >= 0:
                now = modnCr(one+dtwo,one,mod,fac,inv) * zero
        elif X % 2 == 1 and one == 0:
            now = zero

        #print (one,two,now)
        
        ans += now
        ans %= mod

print (ans)
            

```


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, X;
    static int MOD = 998244353;
    static long[] fac, inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        fac = new long[N + 10];
        inv = new long[N + 10];
        fac[0] = 1;
        inv[0] = 1;
        for (int i = 1; i <= N + 5; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = power(fac[i], MOD - 2);
        }

        long ans = 0;
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) break;
                int dist = one + two * 2;
                long zero = nCr(N, one + two);
                long now = 0;
                if (dist < X) {
                    now = nCr(one + two, one) * zero % MOD;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) continue;
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = nCr(one + dtwo, one) * zero % MOD;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }
                ans += now;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }

    static long nCr(int n, int r) {
        if (n < r) return 0;
        if (r < 0) return 0;
        return fac[n] * inv[r] % MOD * inv[n - r] % MOD;
    }

    static long power(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return ans;
    }
}
```<|endoftext|>
