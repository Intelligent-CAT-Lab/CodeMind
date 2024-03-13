<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
print(x if x%y else -1)
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

        if (x % y == 0) {
            System.out.println(-1);
        } else {
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if the first one is divisible by the second one, and prints -1 if it is, or the first integer if it's not.<｜end▁of▁sentence｜>
