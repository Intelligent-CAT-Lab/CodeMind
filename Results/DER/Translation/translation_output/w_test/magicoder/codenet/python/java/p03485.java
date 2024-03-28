<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
2


```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = (a + b) / 2.0;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the average of the two numbers, and then checks if the average is a whole number. If it is, it prints the whole number. If it isn't, it prints the next whole number after the average.<｜end▁of▁sentence｜>
