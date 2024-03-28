<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54 20

Expected output:
62

```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)

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
        scanner.close();

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }

        System.out.println(y);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, swaps them if necessary, and then calculates the greatest common divisor (GCD) of the two numbers using the Euclidean algorithm. The GCD is then printed to the console.<｜end▁of▁sentence｜>
