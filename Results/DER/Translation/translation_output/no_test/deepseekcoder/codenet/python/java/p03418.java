<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
count = 0

for i in range(K + 1, N + 1):
    count += ((N + 1) // i) * (i - K) + max(0, (N + 1) % i - K)

if K == 0:
    count -= len(range(K + 1, N + 1))

print (count)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long count = 0;

        for (int i = K + 1; i <= N + 1; i++) {
            count += ((N + 1) / i) * (i - K);
            count += Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= (N - K);
        }

        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the input, then it calculates the count of numbers in the range from K+1 to N+1. The result is printed out.

Please note that in Java, the `//` operator performs integer division, which means it rounds down the result to the nearest whole number. The `%` operator gives the remainder of the division. The `Math.max(0, (N + 1) % i - K)` part is used to handle the case where `(N + 1) % i` is less than K. In this case, we don't want to add anything to the count, so we use `Math.max(0, ...)` to ensure we add at least 0.
<|EOT|>
