<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YE

```
r, g, b = map(int, input().split())

if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and checks if the remainder of the division of the sum of the second and third integers by 4 is 0. If it is, it prints "YES", otherwise it prints "NO".
<|EOT|>
