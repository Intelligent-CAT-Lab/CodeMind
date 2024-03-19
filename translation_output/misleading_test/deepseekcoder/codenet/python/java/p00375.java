<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
68

Expected output:
90

```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates `(x - 30) / 2`, and prints the result.
<|EOT|>
