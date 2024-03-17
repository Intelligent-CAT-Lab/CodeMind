<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 8

Expected output:
1


```
t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

This Java code reads two integers from the standard input (System.in), calculates the result as per the Python code, and then prints the result.

Please note that in Java, the division operator `/` performs integer division, which means it will always round down to the nearest whole number. If you want to perform floating-point division, you should use the `double` type and the `/` operator.<｜end▁of▁sentence｜>
