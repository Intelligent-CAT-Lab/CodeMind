<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 17

Expected output:
43

```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println(Math.max(0, x - t));
    }
}
```

This Java code reads two integers from the standard input, calculates `x - t`, and prints the result if it's greater than 0, otherwise it prints 0. The `Math.max` function is used to ensure that the result is always 0 or greater.
<|EOT|>
