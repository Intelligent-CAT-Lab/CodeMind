<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
-65 56

```
a, b, c = map(int, input().split())

if a < b:
    if c < a:
        print(c, b)
    elif b < c:
        print(a, c)
    else:
        print(a, b)
else:
    if c < b:
        print(c, a)
    elif a < c:
        print(b, c)
    else:
        print(b, a)

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

        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and then prints two integers based on the conditions in the Python code.
<|EOT|>
