<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
19


```
K = int(input())
a = 0
d = 1
def snuke(x):
    a = 0
    while x>0:
        a += x%10
        x //= 10
    return a
for i in range(1, K+1):
    x = a + d
    y = a + 10*d
    if x/snuke(x) <= y/snuke(y):
        a = x
    else:
        a = y
        d *= 10
    print(a)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;
        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if ((double) x / snuke(x) <= (double) y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then for each number from 1 to K, it calculates two numbers x and y, and then checks if x/snuke(x) is less than or equal to y/snuke(y). If it is, it sets a to x, otherwise it sets a to y and doubles d. It then prints the current value of a. The function snuke calculates the sum of the digits of a number.<｜end▁of▁sentence｜>
