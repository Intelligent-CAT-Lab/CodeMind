<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        System.out.println((500*K >= X) ? "Yes" : "No");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, multiplies the first one by 500, and then checks if the result is greater than or equal to the second integer. If it is, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
