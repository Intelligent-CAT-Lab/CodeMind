<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int k = (int) (Math.log(Y / X) / Math.log(2));
        System.out.println(k);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the logarithm of the quotient of Y and X divided by 2 (which is equivalent to Y//X in Python), and then divides the result by the logarithm of 2 to get the bit length. The result is then printed to the standard output.<｜end▁of▁sentence｜>
