<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 0 0 0 0

Expected output:
-20

```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();
        scanner.close();

        int a;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        } else {
            a = 0;
        }
        int b = ((I / 2 + J / 2 + L / 2) * 2 + O);
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}
```

This Java code reads the input from the user and then calculates the value of `a` and `b` as per the given Python code. It then prints the maximum of `a` and `b`.<｜end▁of▁sentence｜>
