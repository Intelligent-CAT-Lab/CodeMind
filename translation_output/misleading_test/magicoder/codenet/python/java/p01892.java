<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19 30 3

Expected output:
-91

```
a, b, n = map(int, input().split())
score = abs(a - b)
for x in range(1, n + 1):
  for y in range(1, n + 1):
    if b * x % y == 0:
      new_a = b * x // y
      score = min(score, abs(a - new_a))
print(score)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int score = Math.abs(a - b);
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (b * x % y == 0) {
                    int new_a = b * x / y;
                    score = Math.min(score, Math.abs(a - new_a));
                }
            }
        }
        System.out.println(score);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the absolute difference between `a` and `b`, and then iterates over all pairs of integers `x` and `y` from 1 to `n`. If `b * x` is divisible by `y`, it calculates a new value for `a`, calculates the absolute difference between `a` and this new value, and updates `score` if the new difference is smaller. Finally, it prints the smallest difference found.<｜end▁of▁sentence｜>
