<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        System.out.println(500*K>=X ? "Yes" : "No");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, multiplies the first one by 500, and checks if the result is greater than or equal to the second integer. If it is, it prints "Yes"; otherwise, it prints "No".
<|EOT|>
