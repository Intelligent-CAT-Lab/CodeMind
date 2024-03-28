<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
14

```
a, b, t = map(int, input().split())
print((t // a) * b)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println((t / a) * b);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the result as ```(t / a) * b```, and prints the result.
<|EOT|>
