<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5000000000


```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((N + 1) / (double) N / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's even, and then prints the appropriate value. The division operation in Java is performed using the `/` operator, but if you want to perform floating-point division, you need to cast one of the operands to `double`.<｜end▁of▁sentence｜>
