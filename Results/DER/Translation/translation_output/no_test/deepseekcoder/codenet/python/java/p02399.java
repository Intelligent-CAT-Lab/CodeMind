<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d %.6f", a / b, a % b, (float) a / b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, divides the first by the second, and prints the result of the division, the remainder of the division, and the floating-point division. The `%.6f` in the `printf` statement specifies that the floating-point number should be printed with 6 digits after the decimal point.
<|EOT|>
