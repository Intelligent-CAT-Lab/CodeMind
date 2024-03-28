<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
74

```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

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
        scanner.close();

        int gcd = gcd(a, b);
        System.out.println(a + b - gcd + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates their greatest common divisor using the `gcd` method, and then prints the sum of the two integers minus the greatest common divisor plus one.<｜end▁of▁sentence｜>
