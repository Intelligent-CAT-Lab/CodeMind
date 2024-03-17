<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        int intN = (int) n;
        double result = sqrtN + intN;
        System.out.printf("%.12f%n", result);
    }
}
```

This Java code reads a double number from the standard input, calculates the square root of the number, converts the number to an integer (by truncating the decimal part), and then adds the square root and the integer parts together. The result is then printed to the standard output, formatted to 12 decimal places.

Please note that in Java, the `//` operator performs integer division, which truncates the decimal part. The `**` operator is used for exponentiation, but in Java, you can use `Math.pow(base, exponent)` to achieve the same result.
<|EOT|>
