<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-95.59809439141243

```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if (d > 0) {
            double result = 2.0 * (n - d) * (m - 1) / Math.pow(n, 2);
            System.out.println(result);
        } else {
            double result = (m - 1) / (double)n;
            System.out.println(result);
        }
    }
}
```

This Java code reads three integers from the standard input, and then calculates and prints the result based on the conditions in the Python code. The division operation in Java is performed using `/`, which performs integer division if both operands are integers. To perform floating-point division, one or both operands must be of type `double`.

The `Math.pow(n, 2)` function is used to calculate the square of `n`.
<|EOT|>
