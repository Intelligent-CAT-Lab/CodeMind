Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1500 2000 1600 3 2

Expected output:
7948

```
A,B,C,X,Y = map(int,input().split())

mi = min(X,Y)
a = A*X+B*Y
b = mi*C*2+A*(X-mi)+B*(Y-mi)
c = max(X,Y)*C*2

print(min(a,b,c))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        System.out.println(Math.min(a, Math.min(b, c)));
    }
}
```<|endoftext|>
