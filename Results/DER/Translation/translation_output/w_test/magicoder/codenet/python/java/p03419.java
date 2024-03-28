<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n == 1 || m == 1) {
            if (n * m == 1) {
                System.out.println(1);
            } else {
                System.out.println(Math.max(n, m) - 2);
            }
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers from the standard input, and then checks if either of them is 1. If so, it checks if the product of the two numbers is 1. If it is, it prints 1. If it's not, it prints the maximum of the two numbers minus 2. If neither of the numbers is 1, it prints the product of the difference of the two numbers by 2.<｜end▁of▁sentence｜>
