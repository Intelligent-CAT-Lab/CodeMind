<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 2 0

Expected output:
51

```
def inverse(k):
    return fast_pow(k, MOD - 2)


def comb(n, k):
    return FACT[n] * INVERSE_FACT[n - k] * INVERSE_FACT[k] % MOD


def fast_pow(x, y):
    if y == 0:
        return 1
    p = fast_pow(x, y // 2) % MOD
    p = p * p % MOD
    if y % 2:
        p = p * x % MOD
    return p


MOD = 1000000007

n, a, b, c = map(int, input().split())

FACT = [0] * (n + 1)
INVERSE_FACT = [0] * (n + 1)

FACT[0] = 1
INVERSE_FACT[0] = 1
for i in range(1, n + 1):
    FACT[i] = FACT[i - 1] * i % MOD
    INVERSE_FACT[i] = inverse(FACT[i])

ans = 0
if b % 2 != 0:
    print(0)
    exit()

for y in range(0, min(a + 1, c + 1)):
    for z in range(0, (c - y) // 3 + 1):
        x = a - y
        rest3 = c - y - 3 * z

        if b == 0 and rest3 != 0:
            continue

        cur_ans = FACT[x + y + z] * INVERSE_FACT[x] % MOD
        cur_ans = cur_ans * INVERSE_FACT[y] % MOD
        cur_ans = cur_ans * INVERSE_FACT[z] % MOD
        cur_ans = cur_ans * comb(x + y + z + 1 + b // 2 - 1, b // 2) % MOD
        cur_ans = cur_ans * comb(b // 2 + rest3 - 1, rest3) % MOD

        ans = (ans + cur_ans) % MOD

print(ans)

```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    static long[] fact = new long[100001];
    static long[] inverseFact = new long[100001];

    static long inverse(long k) {
        return fastPow(k, MOD - 2);
    }

    static long comb(int n, int k) {
        return (fact[n] * inverseFact[n - k] % MOD) * inverseFact[k] % MOD;
    }

    static long fastPow(long x, long y) {
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2) % MOD;
        p = (p * p) % MOD;
        if (y % 2 != 0) {
            p = (p * x) % MOD;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        fact[0] = 1;
        inverseFact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            inverseFact[i] = inverse(fact[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                long curAns = (fact[x + y + z] * inverseFact[x] % MOD) * inverseFact[y] % MOD;
                curAns = (curAns * inverseFact[z] % MOD) * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                curAns = (curAns * comb(b / 2 + rest3 - 1, rest3) % MOD);

                ans = (ans + curAns) % MOD;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the factorial and inverse factorial, and then calculates the answer. The `fastPow` function is used to calculate the power of a number modulo `MOD`. The `comb` function calculates the combination of two numbers. The `inverse` function calculates the inverse of a number modulo `MOD`. The `main` function is the entry point of the program.<｜end▁of▁sentence｜>
