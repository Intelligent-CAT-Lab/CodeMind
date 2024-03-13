<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

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

        int max = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(max);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the maximum of the three possible results (a-b, a+b, a*b), and then prints the result.<｜end▁of▁sentence｜>
