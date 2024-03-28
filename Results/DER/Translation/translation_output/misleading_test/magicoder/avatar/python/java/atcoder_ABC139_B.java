<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 8

Expected output:
-95

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
        String[] input = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result as `(h - 2) / (t - 1) + 1`, and then prints the result.<｜end▁of▁sentence｜>
