<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 10

Expected output:
3


```
a, b = map(int, input().split())
total = 1
ans = 0

while total < b:
    ans += 1
    total += a-1

print(ans)

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
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans += 1;
            total += a - 1;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then it calculates the number of times `a - 1` can be added to `total` before it becomes greater than or equal to `b`. The result is then printed to the standard output.<｜end▁of▁sentence｜>
