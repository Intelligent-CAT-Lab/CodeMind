<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, Z;
        X = scanner.nextInt();
        Y = scanner.nextInt();
        Z = scanner.nextInt();
        int A = X;
        int B = Y;
        int C = Z;
        B = X;
        C = Y;
        A = Z;
        System.out.println(A, B, C);
    }
}
```</s>
