<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16

Expected output:
pon


```
n=int(input())%10
if n==3:
    print("bon")
elif n in [2,4,5,7,9]:
    print("hon")
else:
    print("pon")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();

        if (n == 3) {
            System.out.println("bon");
        } else if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the remainder when divided by 10, and then checks the remainder against a series of conditions to print the corresponding string.<｜end▁of▁sentence｜>
