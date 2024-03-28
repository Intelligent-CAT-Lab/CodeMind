<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
5

```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println((int)Math.floor(A * Math.min(B-1, N) / B));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the minimum of `B-1` and `N`, multiplies it with `A`, and then divides the result by `B`. The `Math.floor()` function is used to round down the result to the nearest integer. The result is then printed to the console.
<|EOT|>
