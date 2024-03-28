<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
-1

```
n, m = map(int, input().split())
print((n-1)*(m-1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```

This Java code reads two integers from the standard input, calculates the product of `(n-1)` and `(m-1)`, and prints the result. The `Scanner` class is used to read the input, and the `nextInt()` method is used to read each integer. The result is then printed to the standard output using `System.out.println()`.
<|EOT|>
