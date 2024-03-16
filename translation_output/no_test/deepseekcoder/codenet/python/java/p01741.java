<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        int nInt = (int)n;
        double result;
        if (n * Math.sqrt(2) < nInt + 1) {
            result = n * Math.sqrt(2);
        } else {
            result = nInt + 1;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a float number from the standard input, calculates the square root of 2, multiplies it with the input number, and checks if the result is less than the integer part of the input number plus 1. If it is, it prints the result of the multiplication; otherwise, it prints the integer part of the input number plus 1.
<|EOT|>
