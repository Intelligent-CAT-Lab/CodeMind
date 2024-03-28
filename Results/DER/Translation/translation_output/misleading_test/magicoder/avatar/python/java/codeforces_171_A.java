<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600307

```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder b = new StringBuilder(input[1]);
        b.reverse();
        long result = Long.parseLong(input[0]) + Long.parseLong(b.toString());
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two space-separated integers from the standard input, reverses the second integer, and then adds the two integers. The result is then printed to the standard output.

Please note that Java uses long for integer types, so the input numbers should not exceed the maximum value of a long (9,223,372,036,854,775,807). If the input numbers are larger, you should use BigInteger class instead.<｜end▁of▁sentence｜>
