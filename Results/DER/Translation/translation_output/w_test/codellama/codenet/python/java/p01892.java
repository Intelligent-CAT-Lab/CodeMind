<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
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
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It then uses a nested `for` loop to iterate over the possible values of `x` and `y`, and checks if `b * x % y == 0`. If this condition is true, it calculates the new value of `a` using `b * x / y`, and updates the `score` variable with the minimum absolute difference between the original `a` and the new `a`. Finally, it prints the `score` variable as the output.</s>
