<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2

Expected output:
7


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
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;

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

This Java code does the same thing as the Python code. It reads two integers from the input, then it iterates over the range from K+1 to N+1, adding to the count the number of multiples of each number in the range, and the remainder of the division of N+1 by the current number minus K. If K is 0, it subtracts the length of the range from the count. Finally, it prints the count.
<|EOT|>
