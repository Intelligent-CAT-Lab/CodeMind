<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
9


```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 0; b < x; b++) {
            for (int p = 2; p < x; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int) Math.pow(b, p));
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it calculates the maximum power of a number that is less than or equal to the input number. The result is then printed to the standard output.<｜end▁of▁sentence｜>
