<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
15800


```
N = int(input())
print(800*N-200*(N//15))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(800*N-200*(N/15));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the result as 800*N-200*(N//15), and prints the result to the standard output.
<|EOT|>
