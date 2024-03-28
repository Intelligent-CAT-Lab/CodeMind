<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12

Expected output:
16


```
x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if the second integer is a multiple of the first one, and then prints the sum or difference of the two integers accordingly.<｜end▁of▁sentence｜>
