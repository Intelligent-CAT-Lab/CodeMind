<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12 20

Expected output:
15

```
import math
import sys


def rem(a, b, c):
    if a % 2 != 0 or b % 2 != 0 or c % 2 != 0:
        return False
    else:
        return True
def isDouble(a, b, c):
    if (a%1!=0 or b%1!=0 or c%1!=0):
        return False
    else:
        return True
a, b, c = map(int, input().split())
cnt = 0
fa = a
fb = b
fc=c
while True:
    if (cnt != 0 and fa == a and fb == b and fc == c):
        print(-1)
        sys.exit()
    tmp1 = a / 2
    tmp2 = b / 2
    tmp3 = c / 2
    if (not isDouble(tmp1, tmp2, tmp3)):
        break
    cnt += 1
    a = tmp2 + tmp3
    b = tmp1 + tmp3
    c = tmp1 + tmp2
    if (not rem(a, b, c)):
        break
print(cnt)

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;
        while (true) {
            if (cnt != 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                System.exit(0);
            }
            double tmp1 = a / 2.0;
            double tmp2 = b / 2.0;
            double tmp3 = c / 2.0;
            if (!isDouble(tmp1, tmp2, tmp3)) {
                break;
            }
            cnt += 1;
            a = (int) tmp2 + (int) tmp3;
            b = (int) tmp1 + (int) tmp3;
            c = (int) tmp1 + (int) tmp2;
            if (!rem(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }

    private static boolean rem(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    private static boolean isDouble(double a, double b, double c) {
        return a % 1 == 0 && b % 1 == 0 && c % 1 == 0;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, and then it performs the operations described in the while loop until one of the conditions is not met. The number of iterations is then printed to the standard output.
<|EOT|>
