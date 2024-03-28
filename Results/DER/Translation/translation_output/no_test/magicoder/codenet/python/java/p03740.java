<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if their difference is less than or equal to 1, and prints "Brown" if it is, or "Alice" if it's not.<｜end▁of▁sentence｜>
