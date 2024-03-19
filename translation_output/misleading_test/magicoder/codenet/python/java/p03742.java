<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
:rO,u

```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
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
        scanner.close();

        if (Math.abs(a - b) > 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Brown");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the absolute difference between them, and then prints "Alice" if the difference is greater than 1, otherwise it prints "Brown".<｜end▁of▁sentence｜>
