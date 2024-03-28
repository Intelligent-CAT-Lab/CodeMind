<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
9


```
range = xrange
S = int(raw_input())
MOD = 10**9+7
ans = 0

# l has <= 7 digits
r = 1
tot = 1
for l in range(1, 10000000):
    while tot < S:
        r+= 1
        tot+= len(str(r))
    if tot == S: ans+= 1
    tot-= len(str(l))

# l has > 7 digits
for cnt in range(1, S+1):
    d, m = divmod(S, cnt)
    if d <= 7: break
    if m: ans+= 1
    else: ans+= pow(10, d, MOD) - pow(10, d-1, MOD) - cnt + 1
    ans%= MOD
print ans % MOD
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        long MOD = 1000000007;
        long ans = 0;

        // l has <= 7 digits
        for (int r = 1; r <= 9; r++) {
            long tot = r;
            for (int l = 1; l <= 9; l++) {
                tot += (l * 10) % MOD;
                if (tot >= S) {
                    ans++;
                    break;
                }
            }
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            long d = S / cnt;
            long m = S % cnt;
            if (d <= 7) {
                break;
            }
            if (m != 0) {
                ans++;
            } else {
                ans += (long) Math.pow(10, d, MOD) - (long) Math.pow(10, d - 1, MOD) - cnt + 1;
            }
            ans %= MOD;
        }

        System.out.println(ans % MOD);
    }
}
```</s>
