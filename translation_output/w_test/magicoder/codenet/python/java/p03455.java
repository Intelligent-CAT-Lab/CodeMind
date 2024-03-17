<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even


```
a, b = map(int, input().split())
c = a * b
if c % 2 == 1:
    print('Odd')
else:
    print('Even')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, multiplies them together, and then checks if the result is odd or even. If the result is odd, it prints "Odd". If the result is even, it prints "Even".<｜end▁of▁sentence｜>
