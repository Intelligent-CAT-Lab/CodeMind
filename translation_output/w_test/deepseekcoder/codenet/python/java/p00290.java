<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 2

Expected output:
40


```
a,b= map(int,input().split())

print(a*b)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }
}
```

This Java code reads two integers from the standard input, multiplies them together, and prints the result. It uses the `Scanner` class to read the input, which is similar to the `input()` function in Python. The `nextInt()` method reads an integer from the input, and the `*` operator multiplies them together. The result is then printed to the standard output using `System.out.println()`.
<|EOT|>
