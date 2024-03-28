<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
41

```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```

@@ Response
Here is the Java version of the given Python code:

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

        int ans = Math.max(0, Math.min(B, D) - Math.max(A, C));
        System.out.println(ans);
    }
}
```

This Java code reads four integers from the standard input (System.in), calculates the difference between the minimum of B and D and the maximum of A and C, and then prints the result. If the result is less than or equal to 0, it prints 0.<｜end▁of▁sentence｜>
