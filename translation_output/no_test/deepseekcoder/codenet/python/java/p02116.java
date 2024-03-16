<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print((n+1) &- (n+1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & -(n + 1));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an integer from the standard input, adds 1 to it, and then calculates the bitwise AND of the result and the negation of the result. The result is then printed to the standard output.
<|EOT|>
