<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
010
001


```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    System.out.print("0");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("1");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.print("1");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, and then prints a grid of 0s and 1s according to the conditions specified in the Python code.<｜end▁of▁sentence｜>
