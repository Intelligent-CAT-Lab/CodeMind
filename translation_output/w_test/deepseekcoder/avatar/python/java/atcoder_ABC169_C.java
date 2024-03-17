<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[1].substring(0, 1) + splitInput[1].substring(2);
        long a = Long.parseLong(splitInput[0]);
        long bLong = Long.parseLong(b);
        System.out.println((a * bLong) / 100);
    }
}
```

This Java code reads a line of input, splits it into two parts, converts the first part to a long, and the second part to an integer. It then calculates the product of the two numbers, divides it by 100, and prints the result.

Please note that in Java, the division of two integers results in an integer. If you want to get a floating point result, you should use floating point numbers (`double` or `float`) instead of integers.
<|EOT|>
