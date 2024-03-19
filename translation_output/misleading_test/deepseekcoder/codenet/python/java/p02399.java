<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-34 81 -80.90022307618028

```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d %.6f", a / b, a % b, (double) a / b);
    }
}
```

This Java code reads two integers from the standard input, divides the first by the second, calculates the remainder of the division, and prints the results. The division result is printed with 6 decimal places.

Please note that in Java, the division of two integers results in an integer. If you want a floating-point result, you need to cast at least one of the operands to a double or float.
<|EOT|>
