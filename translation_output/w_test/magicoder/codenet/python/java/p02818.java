<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
0 2


```
a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            return;
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, and then checks if the first integer is less than or equal to the third integer. If it is, it subtracts the first integer from the third and sets the first integer to 0. If it's not, it prints the difference between the first and the third integer, followed by the second integer, and then exits. If the first integer is greater than the third integer, it prints 0 followed by the maximum of the difference between the second and the third integer and 0.<｜end▁of▁sentence｜>
