<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5500


```
print(int(int(input()) // 500 * 500))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num / 500 * 500);
    }
}
```

This Java code reads an integer from the standard input, divides it by 500, rounds down to the nearest integer, and then multiplies the result by 500. The result is then printed to the standard output.
<|EOT|>
