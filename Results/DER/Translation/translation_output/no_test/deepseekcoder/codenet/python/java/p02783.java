<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the ceiling division of the first by the second, and prints the result. The `Scanner` class is used to read the input, and `Math.ceil` is used to calculate the ceiling division. The division is cast to `double` before the `ceil` function to ensure that the division is floating point division, not integer division. The result of the `ceil` function is then cast back to `int` before printing.
<|EOT|>
