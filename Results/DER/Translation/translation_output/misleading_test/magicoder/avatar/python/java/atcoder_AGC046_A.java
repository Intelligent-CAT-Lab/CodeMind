<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
435

```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i += 1;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it enters a loop where it adds the integer to a variable `a`. If `a` is divisible by 360, it prints the current value of `i` and breaks the loop. If `a` is not divisible by 360, it increments `i` by 1 and continues the loop.<｜end▁of▁sentence｜>
