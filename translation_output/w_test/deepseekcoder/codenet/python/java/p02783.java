<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println((int)Math.ceil((double)H/A));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the ceiling division of the first by the second, and prints the result. The `Math.ceil` function in Java returns the smallest double value that is greater than or equal to the argument, and `(double)H/A` is explicitly cast to double to ensure that the division operation returns a double. The result is then cast back to int using `(int)`.
<|EOT|>
