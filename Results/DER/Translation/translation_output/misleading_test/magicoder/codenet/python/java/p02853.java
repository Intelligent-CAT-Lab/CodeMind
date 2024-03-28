<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
999991

```
# A - DDCC Finals
x,y = map(int, input().split())
X = 0
Y = 0


if x == 3:
    X = 100000
elif x == 2:
    X = 200000
elif x == 1:
    X = 300000
else :
    X = 0

if y == 3:
    Y = 100000
elif y == 2:
    Y = 200000
elif y == 1:
    Y = 300000
else:
    Y = 0

if x == 1 and y == 1:
    print(X+Y+400000)
else:
    print(X +Y)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int X = 0;
        int Y = 0;

        if (x == 3) {
            X = 100000;
        } else if (x == 2) {
            X = 200000;
        } else if (x == 1) {
            X = 300000;
        }

        if (y == 3) {
            Y = 100000;
        } else if (y == 2) {
            Y = 200000;
        } else if (y == 1) {
            Y = 300000;
        }

        if (x == 1 && y == 1) {
            System.out.println(X + Y + 400000);
        } else {
            System.out.println(X + Y);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the values of X and Y based on the conditions in the Python code, and then prints the sum of X and Y. If both x and y are 1, it adds an additional 400000 to the sum.<｜end▁of▁sentence｜>
