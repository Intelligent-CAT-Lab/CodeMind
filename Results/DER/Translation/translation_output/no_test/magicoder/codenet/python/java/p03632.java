<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
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
        int D = scanner.nextInt();
        scanner.close();

        int ans = Math.max(A, C) > Math.min(B, D) ? 0 : Math.min(B, D) - Math.max(A, C);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, calculates the difference between the maximum of the first two and the minimum of the last two, and then prints the result. If the difference is negative or zero, it prints 0.<｜end▁of▁sentence｜>
