<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19 30 3

Expected output:
1


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

### Response:
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

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the absolute difference between the first two, and then iterates over all possible pairs of `x` and `y` in the range from 1 to `n` (inclusive). For each pair, it checks if `b * x` is divisible by `y` without a remainder. If it is, it calculates a new value for `a` by dividing `b * x` by `y`, and updates the score to be the minimum of the current score and the absolute difference between `a` and the new value of `a`. Finally, it prints the score.
<|EOT|>
