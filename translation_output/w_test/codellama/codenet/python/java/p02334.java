<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
21


```
N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long result = (p * pow(q, MOD - 2, MOD)) % MOD;
        System.out.println(result);
    }

    private static long pow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}
```
This code uses the same algorithm as the Python code, but it is written in Java. It uses the `Scanner` class to read the input from the user, and it uses the `pow` method to calculate the power of `q` modulo `MOD`. The `pow` method is a helper method that calculates the power of `a` to the power of `b` modulo `mod`. It is defined as a recursive function that calculates the power of `a` to the power of `b` by repeatedly multiplying `a` by itself and reducing the power by half. The `result` variable is used to store the final result, which is the product of `p` and `q` raised to the power of `MOD - 2` modulo `MOD`. Finally, the result is printed to the console.</s>
