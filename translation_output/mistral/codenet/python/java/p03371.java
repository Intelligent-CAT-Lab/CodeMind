<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C,X,Y = map(int,input().split())

mi = min(X,Y)
a = A*X+B*Y
b = mi*C*2+A*(X-mi)+B*(Y-mi)
c = max(X,Y)*C*2

print(min(a,b,c))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, X, Y;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        X = scanner.nextInt();
        Y = scanner.nextInt();

        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        System.out.println(Math.min(a, b, c));
    }
}
```</s>
