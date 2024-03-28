<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            System.exit(0);
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (x == 0 && y < 0) {
            System.out.println(Math.abs(y) + 1);
            System.exit(0);
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(Math.abs(y) - Math.abs(x)) + 1);
            System.exit(0);
        }
        if (y < 0 && x < 0) {
            System.out.println(Math.abs(Math.abs(y) - Math.abs(x)) + 1);
            System.exit(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates their absolute values, and then prints the result of a certain calculation depending on the values of the integers.
<|EOT|>
