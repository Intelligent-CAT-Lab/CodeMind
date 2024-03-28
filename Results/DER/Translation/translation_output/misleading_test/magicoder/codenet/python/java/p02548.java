<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-43

```
n = int(input())

cnt = 0
for a in range(1, n):
    for b in range(1, n):
        x = a * b
        if x >= n:
            break
        cnt += 1

print(cnt)            

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it iterates over all pairs of integers `a` and `b` such that `1 <= a < n` and `1 <= b < n`. For each pair, it calculates the product `x = a * b`. If `x >= n`, it breaks the inner loop. Otherwise, it increments the counter `cnt`. Finally, it prints the value of `cnt`.<｜end▁of▁sentence｜>
