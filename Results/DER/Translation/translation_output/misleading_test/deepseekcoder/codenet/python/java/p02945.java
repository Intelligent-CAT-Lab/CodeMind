<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-13 3

Expected output:
41

```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

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
        System.out.println(max(a-b, a+b, a*b));
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
```

This Java code reads two integers from the standard input, calculates the maximum of the three values (a-b, a+b, a*b), and prints the result. The `max` method is a helper method that returns the maximum of three integers.
<|EOT|>
