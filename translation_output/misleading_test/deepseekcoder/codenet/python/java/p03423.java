<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
-66

```
print( int(input()) // 3)

```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input / 3);
    }
}
```

This Java code reads an integer from the standard input, divides it by 3, and prints the result. It uses the `Scanner` class to read the input, which is similar to the `input()` function in Python. The division operation `/` in Java is equivalent to the integer division in Python.
<|EOT|>
