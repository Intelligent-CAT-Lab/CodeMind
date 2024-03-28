<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
w32nimda

Expected output:
jdo3n2Br

```
print(input()[::-1])

```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = new StringBuilder(input).reverse().toString();
        System.out.println(output);
    }
}
```

This Java code reads a string from the user, reverses it using the `StringBuilder` class's `reverse()` method, and then prints the reversed string.
<|EOT|>
