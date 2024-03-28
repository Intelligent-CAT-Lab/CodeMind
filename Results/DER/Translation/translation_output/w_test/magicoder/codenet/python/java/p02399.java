<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
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

        System.out.printf("%d %d %.5f", a / b, a % b, (float) a / b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, divides the first one by the second one, and prints the result. The `%` operator is used for integer division, and the `%` operator again is used for the remainder of the division. The `%.5f` in the `printf` method is used to print the division result with 5 decimal places.<｜end▁of▁sentence｜>
