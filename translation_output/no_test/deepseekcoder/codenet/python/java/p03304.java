<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        if (d > 0) {
            double result = (2.0 * (n - d) * (m - 1)) / Math.pow(n, 2);
            System.out.println(result);
        } else {
            double result = (m - 1) / (double) n;
            System.out.println(result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and then it calculates and prints the result based on the value of `d`. If `d` is greater than 0, it calculates `(2 * (n - d) * (m - 1)) / n^2`, otherwise it calculates `(m - 1) / n`. The result is printed as a double.
<|EOT|>
