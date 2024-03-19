<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int score = Math.abs(a - b);
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (b * x % y == 0) {
                    int newA = b * x / y;
                    score = Math.min(score, Math.abs(a - newA));
                }
            }
        }
        System.out.println(score);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It first reads in three integers `a`, `b`, and `n` from the user, and then calculates the absolute difference between `a` and `b` and stores it in the variable `score`.

The code then uses a nested `for` loop to iterate over all possible values of `x` and `y` from 1 to `n`, and checks if `b * x % y == 0`. If this condition is true, it calculates the new value of `a` as `b * x / y`, and updates the value of `score` to be the minimum of the current value of `score` and the absolute difference between `a` and the new value of `a`.

Finally, the code prints the value of `score` to the console.

Note that this code assumes that the input values are valid and that the user will only enter integers. If the user enters invalid input, the code may throw an exception.</s>
