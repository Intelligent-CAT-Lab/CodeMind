<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

This Java code reads two integers from the standard input, calculates the expression `(h - 2) / (t - 1) + 1` and prints the result. The `/` operator in Java performs integer division, which discards the fractional part. The `+` operator adds 1 to the result.

Please note that in Java, the `//` operator is used for integer division, which discards the fractional part and returns the largest integer less than or equal to the result. This is not the case in Python, where the `//` operator performs floor division.

Also, please note that this code does not handle potential exceptions, such as `InputMismatchException` if the input is not two integers. You may want to add error handling code to make it more robust.
<|EOT|>
