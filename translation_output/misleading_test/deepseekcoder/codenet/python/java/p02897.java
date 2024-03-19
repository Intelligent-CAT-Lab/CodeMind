<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-15.97688597978339

```
N = int(input())
print(-(-N//2)/N)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-((double)(-N/2))/N);
    }
}
```

This Java code reads an integer from the standard input, calculates the result of the expression `-(-N//2)/N` in Python, and prints the result. The `//` operator in Python is equivalent to the `/` operator in Java for integers, but it rounds the result down to the nearest integer. In Java, we need to cast `-N/2` to `double` to get a floating-point result, and then we can use the `/` operator for floating-point division.
<|EOT|>
