<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(*divmod(int(input())*2,60))

```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] result = divmod(input * 2, 60);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] divmod(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, doubles it, and then divides it by 60 using the `divmod` function. The result is then printed to the console.

The `divmod` function is a custom function that takes two integers as arguments and returns an array of two integers. The first integer in the array is the quotient of the division, and the second integer is the remainder.<｜end▁of▁sentence｜>
