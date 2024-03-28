<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
if a+b == 15:
    print('+')
elif a*b == 15:
    print('*')
else:
    print('x')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then checks if the sum or product of the two integers is 15. If the sum is 15, it prints '+'. If the product is 15, it prints '*'. Otherwise, it prints 'x'.<｜end▁of▁sentence｜>
