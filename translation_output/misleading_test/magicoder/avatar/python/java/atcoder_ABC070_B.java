<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-37

```
a , b , c , d = map ( int , input ( ) . split ( ) )
print ( max ( 0 , min ( b , d ) - max ( a , c ) ) )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int result = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(result);
    }
}
```

This Java code reads the input from the console, splits it into an array of strings, and then converts each string to an integer. It then calculates the result as per the Python code and prints it.<｜end▁of▁sentence｜>
