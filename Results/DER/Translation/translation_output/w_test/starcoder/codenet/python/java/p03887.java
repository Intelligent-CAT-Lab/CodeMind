<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 2 0

Expected output:
2


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
if b % 2!= 0:
    print(0)
    exit()

for y in range(0, min(a + 1, c + 1)):
    for z in range(0, (c - y) // 3 + 1):
        x = a - y
        rest3 = c - y - 3 * z

        if b == 0 and rest3!= 0:
            continue

        cur_ans = FACT[x + y + z] * INVERSE_FACT[x] % MOD
        cur_ans = cur_ans * INVERSE_FACT[y] % MOD
        cur_ans = cur_ans * INVERSE_FACT[z] % MOD
        cur_ans = cur_ans * comb(x + y + z + 1 + b // 2 - 1, b // 2) % MOD
        cur_ans = cur_ans * comb(b // 2 + rest3 - 1, rest3) % MOD

        ans = (ans + cur_ans) % MOD

print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] FACT = new int[n + 1];
        int[] INVERSE_FACT = new int[n + 1];

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = (long) FACT[i - 1] * i % MOD;
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        long ans = 0;
        if (b % 2!= 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a + 1, c + 1); y++) {
            for (int z = 0; (c - y) / 3 + 1 > z; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3!= 0) {
                    continue;
                }

                long cur_ans = (long) FACT[x + y + z] * INVERSE_FACT[x] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[y] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[z] % MOD;
                cur_ans = cur_ans * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                cur_ans = cur_ans * comb(b / 2 + rest3 - 1, rest3) % MOD;

                ans = (ans + cur_ans) % MOD;
            }
        }

        System.out.println(ans);
    }

    public static int inverse(int k) {
        return fastPow(k, MOD - 2);
    }

    public static int comb(int n, int k) {
        return (int) (FACT[n] * INVERSE_FACT[n - k] * INVERSE_FACT[k] % MOD);
    }

    public static int fastPow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int p = fastPow(x, y / 2);
        p = p * p % MOD;
        if (y % 2!= 0) {
            p = p * x % MOD;
        }
        return p;
    }
}
```

'''
<|endoftext|>
