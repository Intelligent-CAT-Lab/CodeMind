<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0.5000000000


```
N = int(input())
print(-(-N//2)/N)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((double)(-(-N/2))/N);
    }
}
```

This Java code reads an integer from the standard input, calculates the result of the Python code, and prints it to the standard output. The division operation in Java is integer division when both operands are integers, so we need to cast one or both operands to `double` to get a floating-point result.
<|EOT|>
