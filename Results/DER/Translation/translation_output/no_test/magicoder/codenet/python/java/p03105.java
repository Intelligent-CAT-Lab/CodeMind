<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, then checks if `a * c` is less than `b`. If it is, it prints `c`. If not, it prints `b / a`.<｜end▁of▁sentence｜>
