<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
wi

```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a + b + c < 22) ? "win" : "bust");
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, adds them together, and then prints "win" if the sum is less than 22, and "bust" otherwise.
<|EOT|>
