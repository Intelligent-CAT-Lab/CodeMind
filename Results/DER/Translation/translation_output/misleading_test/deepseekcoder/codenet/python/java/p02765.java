<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2919

Expected output:
3767

```
n,r = [int(x) for x in input().split()]

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and if the first integer is less than 10, it prints the second integer plus 100 times the difference between 10 and the first integer. Otherwise, it just prints the second integer.
<|EOT|>
