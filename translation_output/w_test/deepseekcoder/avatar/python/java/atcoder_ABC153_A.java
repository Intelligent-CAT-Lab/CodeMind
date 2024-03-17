<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println((int)Math.ceil((double)h / a));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the ceiling division of the first by the second, and prints the result. The `Math.ceil` function in Java returns the smallest double value that is greater than or equal to the argument and is equal to a mathematical integer. The `(double)` cast is used to ensure that the division operation returns a double, which `Math.ceil` can handle. The `(int)` cast is used to convert the result back to an integer before printing.
<|EOT|>
