<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 8

Expected output:
-95

```
t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the expression `(h - 2) / (t - 1) + 1` and prints the result. The `/` operator in Java performs integer division when both operands are integers.
<|EOT|>
