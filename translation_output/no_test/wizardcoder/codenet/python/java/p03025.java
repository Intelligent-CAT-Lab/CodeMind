Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b, c = [int(i) for i in input().split()]
p = 10 ** 9 + 7

ans = 0

def fact(n, p=10**9 + 7):
    f = [1]
    for i in range(1, n+1):
        f.append(f[-1]*i%p)
    return f

def invfact(n, f, p=10**9 + 7):
    inv = [pow(f[n], p-2, p)]
    for i in range(n, 0, -1):
        inv.append(inv[-1]*i%p)
    return inv[::-1]

f = fact(2 * n)
invf = invfact(2 * n, f)

def comb(a, b):
    if a < b:
        return 0
    if a < 0 or b < 0:
        return 0
    return f[a] * invf[b] * invf[a-b] % p

pow_a = [1]
pow_b = [1]
inv_100 = pow(100, p - 2, p)
a = a * inv_100 % p
b = b * inv_100 % p
c = c * inv_100 % p

inv_ab = pow(a + b, p - 2, p)
a = a * inv_ab % p
b = b * inv_ab % p

for i in range(n):
    pow_a.append(pow_a[-1] * a % p)
    pow_b.append(pow_b[-1] * b % p)

for m in range(n, 2 * n):
    ans += comb(m - 1, n - 1) * (pow_a[n] * pow_b[m - n] + pow_a[m - n] * pow_b[n]) * m
    ans %= p

ans *= pow(1 - c, p - 2, p)

print(ans % p)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = (int) Math.pow(10, 9) + 7;

        int ans = 0;

        int[] f = new int[2 * n + 1];
        f[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            f[i] = (int) ((long) f[i - 1] * i % p);
        }

        int[] invf = new int[2 * n + 1];
        invf[2 * n] = pow(f[2 * n], p - 2, p);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invf[i] = (int) ((long) invf[i + 1] * (i + 1) % p);
        }

        int[][] comb = new int[2 * n + 1][2 * n + 1];
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i][j] = (int) ((long) f[i] * invf[j] * invf[i - j] % p);
            }
        }

        int[] pow_a = new int[2 * n + 1];
        pow_a[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            pow_a[i] = (int) ((long) pow_a[i - 1] * a % p);
        }

        int[] pow_b = new int[2 * n + 1];
        pow_b[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            pow_b[i] = (int) ((long) pow_b[i - 1] * b % p);
        }

        int inv_100 = pow(100, p - 2, p);
        a = (int) ((long) a * inv_100 % p);
        b = (int) ((long) b * inv_100 % p);
        c = (int) ((long) c * inv_100 % p);

        int inv_ab = pow(a + b, p - 2, p);
        a = (int) ((long) a * inv_ab % p);
        b = (int) ((long) b * inv_ab % p);

        for (int m = n; m <= 2 * n; m++) {
            ans += comb[m][n] * ((int) ((long) pow_a[n] * pow_b[m - n] % p) + (int) ((long) pow_a[m - n] * pow_b[n] % p)) * m;
            ans %= p;
        }

        ans = (int) ((long) ans * pow(1 - c, p - 2, p) % p);

        System.out.println(ans);
    }

    public static int pow(int a, int b, int p) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (int) ((long) res * a % p);
            }
            a = (int) ((long) a * a % p);
            b /= 2;
        }
        return res;
    }
}
```<|endoftext|>
