<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 25 25 50

Expected output:
2


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
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int p = 1000000007;
        int[] f = new int[2 * n + 1];
        f[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            f[i] = (f[i - 1] * i) % p;
        }

        int[] invf = new int[2 * n + 1];
        invf[2 * n] = pow(f[2 * n], p - 2, p);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invf[i] = (invf[i + 1] * (i + 1)) % p;
        }

        int[] pow_a = new int[n + 1];
        pow_a[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow_a[i] = (pow_a[i - 1] * a) % p;
        }

        int[] pow_b = new int[n + 1];
        pow_b[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow_b[i] = (pow_b[i - 1] * b) % p;
        }

        int ans = 0;
        for (int m = n; m <= 2 * n; m++) {
            ans += (comb(m - 1, n - 1) * (pow_a[n] * pow_b[m - n] + pow_a[m - n] * pow_b[n])) % p;
        }

        ans *= pow(1 - c, p - 2, p);
        System.out.println(ans % p);
    }

    private static int pow(int a, int b, int p) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % p;
        }
        return result;
    }

    private static int comb(int a, int b) {
        if (a < b) {
            return 0;
        }
        if (a < 0 || b < 0) {
            return 0;
        }
        return f[a] * invf[b] * invf[a - b] % p;
    }
}
```
Note that this code assumes that the input values are valid and that the result of the computation will fit in a 32-bit integer. If the input values are larger or the result is larger than a 32-bit integer, you may need to modify the code to use a larger data type or to handle the result in a different way.</s>
