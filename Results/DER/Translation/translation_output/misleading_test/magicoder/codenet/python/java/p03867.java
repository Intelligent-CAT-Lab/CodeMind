<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
-91

```
N, K = map(int, input().split())
MOD = 10 ** 9 + 7
i = 1
M = N
div = []
while i * i <= N:
    if N % i == 0:
        div.append(i)
        if N // i != i:
            div.append(N // i)
    i += 1


div = sorted(div)
N1 = len(div)
num = [0] * (N1 + 1)
ans = 0
for i in range(N1):
    num[i] = pow(K, (div[i] + 1) // 2, MOD)
    for j in range(i):
        if div[i] % div[j] == 0:
            num[i] = num[i] - num[j] + MOD
            num[i] %= MOD

    if div[i] % 2 == 0:
        ans += div[i] * num[i] // 2
        ans %= MOD
    else:
        ans += div[i] * num[i]
        ans %= MOD

print(ans)
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
            i += 1;
        }

        Collections.sort(div);
        int N1 = div.size();
        long[] num = new long[N1 + 1];
        long ans = 0;
        for (i = 0; i < N1; i++) {
            num[i] = pow(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = num[i] - num[j] + MOD;
                    num[i] %= MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += div.get(i) * num[i] / 2;
                ans %= MOD;
            } else {
                ans += div.get(i) * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }

    private static long pow(int base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the input, calculates the divisors of N, and then calculates the sum of the divisors multiplied by the power of K. The result is then printed to the console. The pow function is a helper function that calculates the power of a number modulo a given modulus.<｜end▁of▁sentence｜>
