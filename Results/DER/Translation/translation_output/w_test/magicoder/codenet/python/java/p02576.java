<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
12


```
N,X,T= map(int,input().split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

This Java code reads three integers from the standard input (which is usually the console), and then it checks if the first integer (N) is not divisible by the second integer (X). If it's not, it prints the result of the multiplication of the quotient of N divided by X and T, plus T. If it is, it prints the result of the multiplication of the quotient of N divided by X and T.<｜end▁of▁sentence｜>
