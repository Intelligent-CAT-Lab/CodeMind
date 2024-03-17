<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 10

Expected output:
00000000000000000000000000001000
00000000000000000000000000001010
00000000000000000000000000000010


```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, performs bitwise AND, OR, and XOR operations on them, and prints the results in binary format. The `String.format("%32s", ...)` line is used to ensure that the binary strings are padded with zeros to a length of 32 characters. The `replace(' ', '0')` line is used to replace any spaces in the padded binary strings with zeros.<｜end▁of▁sentence｜>
