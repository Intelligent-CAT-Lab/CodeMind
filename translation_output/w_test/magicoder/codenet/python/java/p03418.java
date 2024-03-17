<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        long count = 0;

        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K);
            count += Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= N - K;
        }

        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the count as described in the Python code, and then prints the result. The ```long``` type is used for the count variable to avoid overflow.<｜end▁of▁sentence｜>
