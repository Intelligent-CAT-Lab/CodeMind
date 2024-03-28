<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
1.0000000000


```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d > 0) {
            double result = 2.0 * (n - d) * (m - 1) / Math.pow(n, 2);
            System.out.printf("%.11f\n", result);
        } else {
            double result = (m - 1) / (double) n;
            System.out.printf("%.11f\n", result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and then calculates and prints the result based on the condition. The result is printed with 11 decimal places.
<|EOT|>
