<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
1i2+2+2=7

```
n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+" ,b, "-" ,c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-" ,b, "-" ,c, "-", d, "=7", sep="")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int a = Integer.parseInt(String.valueOf(n.charAt(0)));
        int b = Integer.parseInt(String.valueOf(n.charAt(1)));
        int c = Integer.parseInt(String.valueOf(n.charAt(2)));
        int d = Integer.parseInt(String.valueOf(n.charAt(3)));

        if (a + b + c + d == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string input from the user, then converts each character of the string to an integer and performs the necessary arithmetic operations. If the result of the arithmetic operation equals 7, it prints the expression and the result.<｜end▁of▁sentence｜>
