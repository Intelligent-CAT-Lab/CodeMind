<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads two integers N and K from the input, calculates the factorial of K from K to K-N+1 (inclusive), and prints the result modulo 10^9 + 7. If K < N, it prints 0.
<|EOT|>
