<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
2


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
[/INST]
```java
import java.util.*;

public class Main {
    static int H, W, A, B;
    static long MOD = 1000000007;

    static long factorial[] = new long[H + W + 1];
    static long inv_factorial[] = new long[H + W + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        Arrays.fill(factorial, 1);
        Arrays.fill(inv_factorial, 1);

        for (int i = 1; i <= H + W; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
            inv_factorial[i] = pow(factorial[i - 1], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += (factorial[H - A + i - 1] * inv_factorial[H - A] * inv_factorial[i - 1]) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }
}
```</s>
