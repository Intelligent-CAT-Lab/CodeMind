<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        int MOD = 1000000007;
        System.out.println(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD));
    }

    public static int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = (ans * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }
}
```
<|endoftext|>
