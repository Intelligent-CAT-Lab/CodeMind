<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561316


```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String b = input[0].substring(0, 1) + input[0].substring(2);
        long a = Long.parseLong(input[0]);
        double c = Double.parseDouble(b);
        long result = (long) (a * c / 100);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into two parts, converts the first part to a long and the second part to a double, and then calculates the result as the product of the two parts divided by 100, rounded down to the nearest whole number.<｜end▁of▁sentence｜>
