<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println('A');
        } else {
            System.out.println('B');
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, compares their absolute differences from `x`, and prints 'A' if the absolute difference of `a` is less than the absolute difference of `b`, and 'B' otherwise.<｜end▁of▁sentence｜>
