<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
-95

```
n = int(input())
print((n+1) &- (n+1))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n+1) & -(n+1));
    }
}
```

This Java code reads an integer from the standard input, calculates ```(n+1) & -(n+1)``` and prints the result. The ```&``` operator is the bitwise AND operator in Java. The ```-``` operator is the unary negation operator in Java, which converts the operand to its binary complement.

Please note that Java does not have a direct equivalent to Python's ```input()``` function, so we use ```Scanner``` to read the input.
<|EOT|>
