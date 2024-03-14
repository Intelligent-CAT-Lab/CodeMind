<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    static long MOD = 1000000007;
    static long[] FACT;
    static long[] INVERSE_FACT;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        FACT = new long[n + 1];
        INVERSE_FACT = new long[n + 1];

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = FACT[i - 1] * i % MOD;
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            System.exit(0);
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0)
                    continue;

                long cur_ans = FACT[x + y + z] * INVERSE_FACT[x] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[y] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[z] % MOD;
                cur_ans = cur_ans * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                cur_ans = cur_ans * comb(b / 2 + rest3 - 1, rest3) % MOD;

                ans = (ans + cur_ans) % MOD;
            }
        }

        System.out.println(ans);
    }

    static long inverse(long k) {
        return fast_pow(k, MOD - 2);
    }

    static long comb(int n, int k) {
        return FACT[n] * INVERSE_FACT[n - k] % MOD * INVERSE_FACT[k] % MOD;
    }

    static long fast_pow(long x, long y) {
        if (y == 0)
            return 1;
        long p = fast_pow(x, y / 2);
        p = p * p % MOD;
        if (y % 2 == 1)
            p = p * x % MOD;
        return p;
    }
}
```
<|EOT|>
