<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print((n+1) &- (n+1))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & -(n + 1));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, adds 1 to it, and then uses the bitwise AND operator with the negation of the result to print the result. The bitwise AND operator is used with the negation of the number to clear all bits of the number except the least significant one.<｜end▁of▁sentence｜>
