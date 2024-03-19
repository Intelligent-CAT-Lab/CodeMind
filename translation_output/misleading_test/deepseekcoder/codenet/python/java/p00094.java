<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15 25

Expected output:
24.04304936049253

```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 100 && b <= 100) {
            double result = (double)a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if they are less than or equal to 100, and if so, it calculates the result as `a * b / 3.305785` and prints it with 4 decimal places.
<|EOT|>
