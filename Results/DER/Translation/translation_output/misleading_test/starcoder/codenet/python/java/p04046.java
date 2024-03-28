<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
54

```
import math
H, W, A, B = map(int, input().split())
MOD = 10 ** 9 + 7

factorial = [1]
inv_factorial = [1]


for i in range(1, H+W+1):
    factorial.append(factorial[-1] * i % MOD)
    inv_factorial.append(pow(factorial[-1], MOD-2, MOD))


def f(h, w):
    return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD


answer = 0
for i in range(B+1, W+1):
    answer += f(H-A, i) * f(A, W-i+1)
    answer %= MOD

print(int(answer))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long MOD = 1000000007;
        long[] factorial = new long[H+W+1];
        long[] inv_factorial = new long[H+W+1];
        factorial[0] = 1;
        inv_factorial[0] = 1;
        for(int i=1; i<=H+W; i++) {
            factorial[i] = factorial[i-1] * i % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2, MOD);
        }
        long answer = 0;
        for(int i=B+1; i<=W; i++) {
            answer += (factorial[H-A] * inv_factorial[i-1] * inv_factorial[W-i+1]) % MOD;
            answer %= MOD;
        }
        System.out.println(answer);
    }
    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}
```
<|endoftext|>
