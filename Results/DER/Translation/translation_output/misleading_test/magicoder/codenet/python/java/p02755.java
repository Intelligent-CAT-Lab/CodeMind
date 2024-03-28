<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
43

```
A, B = map(int, input().split())
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print(ans if f else -1)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean f = false;
        int ans = 0;
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                f = true;
                ans = i;
                break;
            }
        }
        System.out.println(f ? ans : -1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the range of possible values for the integer `i`, and then checks each value in the range to see if it satisfies the condition `i * 8 / 100 == A && i / 10 == B`. If it does, it sets `f` to `true` and `ans` to `i`. Finally, it prints the value of `ans` if `f` is `true`, otherwise it prints `-1`.<｜end▁of▁sentence｜>
