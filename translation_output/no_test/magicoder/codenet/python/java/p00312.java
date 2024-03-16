<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user (D and L), calculates the result (ans), and then prints it. The calculation is the same as in the Python code: it divides D by L, adds the remainder of the division to the result of the division, and then prints the result.<｜end▁of▁sentence｜>
