<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8

Expected output:
mYes

```
x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if ((2 * a + 4 * b) == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then iterates over all possible values of `a` from 0 to `x`. For each `a`, it calculates `b` as `x - a` and checks if `2*a + 4*b` equals `y`. If it does, it sets `count` to 1 and breaks the loop. Finally, it prints "Yes" if `count` is 1, otherwise it prints "No".<｜end▁of▁sentence｜>
