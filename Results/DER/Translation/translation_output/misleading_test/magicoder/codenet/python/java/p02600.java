<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
725

Expected output:
65

```
X = int(input())

if X >= 400 and X <= 599:
  print(8)
elif X >= 600 and X <= 799:
  print(7)
elif X >= 800 and X <= 999:
  print(6)
elif X >= 1000 and X <= 1199:
  print(5)
elif X >= 1200 and X <= 1399:
  print(4)
elif X >= 1400 and X <= 1599:
  print(3)
elif X >= 1600 and X <= 1799:
  print(2)
elif X >= 1800 and X <= 1999:
  print(1)

```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X >= 400 && X <= 599) {
            System.out.println(8);
        } else if (X >= 600 && X <= 799) {
            System.out.println(7);
        } else if (X >= 800 && X <= 999) {
            System.out.println(6);
        } else if (X >= 1000 && X <= 1199) {
            System.out.println(5);
        } else if (X >= 1200 && X <= 1399) {
            System.out.println(4);
        } else if (X >= 1400 && X <= 1599) {
            System.out.println(3);
        } else if (X >= 1600 && X <= 1799) {
            System.out.println(2);
        } else if (X >= 1800 && X <= 1999) {
            System.out.println(1);
        }
    }
}
```

This Java code reads an integer from the standard input, and then checks if it falls into one of the specified ranges. If it does, it prints the corresponding value.<｜end▁of▁sentence｜>
