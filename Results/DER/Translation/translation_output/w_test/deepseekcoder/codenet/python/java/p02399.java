<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

This Java code does the same thing as the Python code. It reads two integers from the input, divides the first by the second, and prints the quotient, remainder, and decimal division result. The `printf` function is used to format the output, similar to the `%` operator in Python. The `%d` and `%f` placeholders are replaced with the quotient, remainder, and decimal division result respectively. The `.5` after the `%f` placeholder specifies that the decimal part should be rounded to 5 digits.
<|EOT|>
