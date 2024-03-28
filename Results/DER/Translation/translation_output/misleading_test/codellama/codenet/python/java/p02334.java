<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-7

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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long result = (p * Math.pow(q, MOD - 2, MOD)) % MOD;
        System.out.println(result);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `Math.pow` method to calculate the power of `q` modulo `MOD`. The `MOD` variable is defined as a constant to make the code more readable.

The `p` and `q` variables are initialized to 1, and then they are updated in a loop using the formula `p = (p * (N + K - 1 - i)) % MOD` and `q = (q * (i + 1)) % MOD`. The loop iterates `N` times.

Finally, the result is calculated using the formula `result = (p * Math.pow(q, MOD - 2, MOD)) % MOD`. The `Math.pow` method is used to calculate the power of `q` modulo `MOD`, and the result is then modulo `MOD` to ensure that it is within the range of the `int` data type.

The `System.out.println` method is used to print the result to the console.</s>
