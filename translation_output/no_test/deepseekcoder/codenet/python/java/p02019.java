<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the result as `n - (c + a - c + b - c)`, and prints the result.
<|EOT|>
