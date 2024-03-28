<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
erow/

```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

@@ Response
Here is the Java version of the given Python code:

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

This Java code reads two integers from the standard input (console), calculates the absolute difference between them, and then prints "Brown" if the difference is less than or equal to 1, otherwise it prints "Alice".<｜end▁of▁sentence｜>
