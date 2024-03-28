<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
9911

```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        int result = (int) Math.ceil((double) h / a);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the ceiling division of the first by the second, and prints the result. The `Math.ceil` function is used to round up the result to the nearest integer. The division is cast to `double` before the division to ensure that the division operation is performed in floating point arithmetic, not integer arithmetic. The result is then cast back to `int` before printing.
<|EOT|>
