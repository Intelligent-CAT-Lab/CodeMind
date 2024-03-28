<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1 7

```
S = int(input())

X1 = 0
Y1 = 0

tmp = int(S**0.5)
if tmp**2 >= S:
    X2 = Y3 = tmp
else:
    X2 = Y3 = tmp+1

rest = X2**2 - S

if rest == 0:
    X3 = Y2 = 0
else:
    if rest < 10**9:
        X3 = 1
        Y2 = rest
    else:
        for i in range(2, int(rest**0.5)+2):
            if rest % i == 0:
                X3 = i
                Y2 = rest // i

print(X1, Y1, X2, Y2, X3, Y3)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X1 = 0;
        int Y1 = 0;
        int X2 = 0;
        int Y2 = 0;
        int X3 = 0;
        int Y3 = 0;
        int tmp = (int) Math.sqrt(S);
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }
        int rest = X2 * X2 - S;
        if (rest == 0) {
            X3 = Y2 = 0;
        } else if (rest < 1000000000) {
            X3 = 1;
            Y2 = rest;
        } else {
            for (int i = 2; i <= Math.sqrt(rest); i++) {
                if (rest % i == 0) {
                    X3 = i;
                    Y2 = rest / i;
                }
            }
        }
        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```</s>
