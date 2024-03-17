<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long vamshi = Long.parseLong(input[0]);
        long z = Long.parseLong(input[1]);
        System.out.println((vamshi / z + 1) * z);
    }
}
```

This Java code does the same thing as the Python code. It reads two space-separated integers from the standard input, calculates the ceiling of the division of the first integer by the second one, and then multiplies the result by the second integer. The `//` operator in Python performs integer division, which rounds down to the nearest whole number. In Java, the `/` operator performs floating-point division, which rounds down to the nearest whole number. Therefore, we need to add 1 to the result of the division to get the ceiling.<｜end▁of▁sentence｜>
