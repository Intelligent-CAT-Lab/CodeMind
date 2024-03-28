<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6

```
N, K = map(int, input().split())
MOD = 10**9 + 7

if K < N:
    print(0)
else:
    ans = 1
    for v in range(K, K-N, -1):
        ans = ans * v % MOD
    print(ans)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        long MOD = (long) Math.pow(10, 9) + 7;

        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v >= K-N+1; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the factorial of the larger number (K or K-N, whichever is larger) modulo 10^9 + 7, and prints the result. If the second number is smaller than the first, it prints 0.
<|EOT|>
