<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
a = int(input())
print(a + a ** 2 + a ** 3)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + (int)Math.pow(a, 2) + (int)Math.pow(a, 3));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, calculates the sum of the number, its square, and its cube, and prints the result. The `Math.pow` function is used to calculate the power of a number in Java.
<|EOT|>
