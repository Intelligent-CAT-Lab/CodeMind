<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
62

```
n = int(input())
print(int((n + 1) * n / 2)) 
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) * n / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of all integers from 1 to n (inclusive), and prints the result.
<|EOT|>
