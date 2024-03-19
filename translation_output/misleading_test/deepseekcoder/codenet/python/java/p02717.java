<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
84 56 -70

```
# ã¹ãã¼ã¹åºåãã®æ´æ°ã®å¥å
X,Y,Z = map(int, input().split())

A=X
B=Y
C=Z

B=X
C=Y
A=Z

print(A,B,C)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int A=X;
        int B=Y;
        int C=Z;

        B=X;
        C=Y;
        A=Z;

        System.out.println(A + " " + B + " " + C);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, assigns them to variables `X`, `Y`, and `Z`, then swaps their values to `A`, `B`, and `C` in a specific order. Finally, it prints the values of `A`, `B`, and `C`.
<|EOT|>
