<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1


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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();

        int X1 = 0;
        int Y1 = 0;

        int tmp = (int) Math.sqrt(S);
        int X2, Y2, X3, Y3;
        if (tmp * tmp >= S) {
            X2 = Y2 = tmp;
        } else {
            X2 = Y2 = tmp + 1;
        }

        int rest = X2 * X2 - S;

        if (rest == 0) {
            X3 = Y3 = 0;
        } else {
            if (rest < 1000000000) {
                X3 = 1;
                Y3 = rest;
            } else {
                for (int i = 2; i <= Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y3 = rest / i;
                    }
                }
            }
        }

        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the square root of the integer, and then calculates the rest of the square. If the rest is 0, it sets X3 and Y3 to 0. If the rest is less than 10^9, it sets X3 to 1 and Y3 to the rest. Otherwise, it finds the factors of the rest and sets X3 and Y3 to these factors. Finally, it prints the results.<｜end▁of▁sentence｜>
