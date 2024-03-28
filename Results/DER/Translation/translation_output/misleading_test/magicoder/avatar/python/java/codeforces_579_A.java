<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
-12

```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) / Math.log(2) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) (Math.log(n) / Math.log(2)));
        }
        System.out.println(x);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it subtracts the largest power of 2 that is less than or equal to the input number from the input number and increments the counter `x` by 1 in each iteration until the input number becomes a power of 2. The counter `x` is then printed as the output.<｜end▁of▁sentence｜>
