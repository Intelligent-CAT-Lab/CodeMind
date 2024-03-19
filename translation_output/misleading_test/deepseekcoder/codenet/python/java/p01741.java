<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
33.29131990083172

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
        int intN = (int)n;
        double result = intN + 1;
        if (sqrtN < result) {
            result = sqrtN;
        }
        System.out.println(result);
    }
}
```

This Java code reads a double number from the standard input, calculates the square root of the number, converts the number to an integer to get the integer part, and then adds 1 to it. If the square root of the number is less than the result, it replaces the result with the square root of the number. Finally, it prints the result.
<|EOT|>
