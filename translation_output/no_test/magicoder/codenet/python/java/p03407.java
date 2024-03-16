<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, checks if the sum of the first two is less than the third, and prints "No" or "Yes" accordingly.<｜end▁of▁sentence｜>
