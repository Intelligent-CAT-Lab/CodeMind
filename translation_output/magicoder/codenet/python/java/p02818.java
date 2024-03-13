<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, and then checks if the first integer is less than or equal to the third integer. If it is, it subtracts the first integer from the third integer and sets the first integer to 0. If it's not, it prints the difference between the first integer and the third integer, and the second integer, and then exits the program. Finally, it prints 0 and the maximum of the difference between the second integer and the third integer and 0.<｜end▁of▁sentence｜>
