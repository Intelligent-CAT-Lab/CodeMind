<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 6

Expected output:
5


```
n, a, b = map(int,input().split())

if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

This Java code reads three integers from the standard input (System.in), and then checks the conditions as in the Python code. It prints the result accordingly.<｜end▁of▁sentence｜>
