<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;
        long ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans++;
            tot -= String.valueOf(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d > 7) break;
            if (m != 0) ans++;
            else ans += (long) Math.pow(10, d) - (long) Math.pow(10, d - 1) - cnt + 1;
            ans %= MOD;
        }
        System.out.println(ans % MOD);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of digits of numbers from 1 to `S`, and prints the result modulo `MOD`.<｜end▁of▁sentence｜>
