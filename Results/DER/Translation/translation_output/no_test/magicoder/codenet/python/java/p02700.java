<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C,D = map(int,input().split())
while A>0 and C>0:
    C -= B
    if C<=0:
        print("Yes")
        break
    A -= D
    if A<=0:
        print("No")
        break
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

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, then enters a loop where it subtracts the value of B from C and the value of D from A. If C becomes less than or equal to 0, it prints "Yes" and breaks the loop. If A becomes less than or equal to 0, it prints "No" and breaks the loop.<｜end▁of▁sentence｜>
