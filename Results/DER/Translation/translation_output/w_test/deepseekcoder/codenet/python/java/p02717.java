<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3 1 2


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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int A = X;
        int B = Y;
        int C = Z;

        B = X;
        C = Y;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}
```
<|EOT|>
