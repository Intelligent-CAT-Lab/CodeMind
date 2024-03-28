<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
5.03637601641222

```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the result as `r * t / a`, and then prints the result with 6 decimal places.
<|EOT|>
