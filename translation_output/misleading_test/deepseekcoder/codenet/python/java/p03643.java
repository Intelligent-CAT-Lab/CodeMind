<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4VC1!0

```
s = str(input())
print("ABC"+s)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("ABC" + s);
    }
}
```

This Java code reads a string from the standard input, appends "ABC" to it, and then prints the result. It uses the `Scanner` class to read the input, which is similar to the `input()` function in Python. The `System.out.println` statement is used to print the result, which is similar to the `print` statement in Python.
<|EOT|>
