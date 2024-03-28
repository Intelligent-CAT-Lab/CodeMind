<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 9

Expected output:
No


```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
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
        int c = scanner.nextInt();
        scanner.close();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) * (c - a - b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```

This Java code reads three integers from the standard input (console), checks if the difference between `c` and `a` and `b` is less than zero, and if so, prints "No". If the difference is not less than zero, it checks if 4 times `a` times `b` is less than the square of the difference between `c` and `a` and `b`, and if so, prints "Yes". If neither condition is met, it prints "No".<｜end▁of▁sentence｜>
