<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 20

Expected output:
10


```
x, y = map(int, input().split())
abs_x = abs(x)
abs_y = abs(y)

if 0 <= x < y:
    print (y - x)
    exit()
if 0 < y < x:
    print (x - y + 2)
    exit()
if y == 0 and 0 < x:
    print (x + 1)
    exit()

if x < y <= 0:
    print (y - x)
    exit()
if y < x < 0:
    print (x - y + 2)
    exit()
if x == 0 and y < 0:
    print (abs_y + 1)
    
if x < 0  < y:
    print (abs(abs_y - abs_x) + 1)
    exit()
if y < 0 < x:
    print (abs(abs_y - abs_x) + 1)
    exit()



```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            return;
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            return;
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            return;
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            return;
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x == 0 && y < 0) {
            System.out.println(Math.abs(y) + 1);
            return;
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(absY - absX) + 1);
            return;
        }
        if (y < 0 && 0 < x) {
            System.out.println(Math.abs(absY - absX) + 1);
            return;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates their absolute values, and then checks various conditions to print the appropriate result.<｜end▁of▁sentence｜>
