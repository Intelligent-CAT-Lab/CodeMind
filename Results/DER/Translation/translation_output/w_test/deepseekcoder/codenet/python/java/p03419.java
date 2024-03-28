<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1 || m == 1) {
            if (n * m == 1) {
                System.out.println(1);
            } else {
                System.out.println(Math.max(n, m) - 2);
            }
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then prints the result of a calculation based on those integers. The calculation is a bit more complex than in the Python code, but the logic is the same.
<|EOT|>
