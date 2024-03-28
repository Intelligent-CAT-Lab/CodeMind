<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-50

```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n <= k) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code reads two integers from the standard input, compares them, and prints `1` if the first integer is less than or equal to the second, and `0` otherwise.
<|EOT|>
