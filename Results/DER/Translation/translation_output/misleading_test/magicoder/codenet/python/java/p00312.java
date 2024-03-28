<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-21

```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

@@ Response
Here is the Java version of the given Python code:

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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result as `D/L + (D-L*(D/L))`, and then prints the result.<｜end▁of▁sentence｜>
