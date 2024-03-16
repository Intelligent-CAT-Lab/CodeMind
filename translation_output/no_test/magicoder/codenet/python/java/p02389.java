<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the product of the two numbers and the sum of the two numbers multiplied by 2, and then prints these results.<｜end▁of▁sentence｜>
