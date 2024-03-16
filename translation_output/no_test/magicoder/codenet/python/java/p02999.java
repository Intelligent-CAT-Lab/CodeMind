<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
print(0 if a<b else 10)
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

        System.out.println(a < b ? 0 : 10);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, compares them, and prints 0 if the first number is less than the second, otherwise it prints 10.<｜end▁of▁sentence｜>
