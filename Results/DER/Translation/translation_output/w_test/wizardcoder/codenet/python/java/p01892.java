Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
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
```<|endoftext|>
