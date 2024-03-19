<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
-42

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int MOD = 1000000007;
        int ans = 0;
        for (int l = 1; l <= 10000000; l++) {
            int r = l;
            int tot = l;
            while (tot < S) {
                r++;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans++;
            tot -= String.valueOf(l).length();
        }
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt, m = S % cnt;
            if (d <= 7) break;
            if (m == 0) ans += (int) Math.pow(10, d) - (int) Math.pow(10, d - 1) - cnt + 1;
            else ans += (int) Math.pow(10, d) - (int) Math.pow(10, d - 1) - cnt;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
