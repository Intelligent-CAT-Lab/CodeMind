<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 10

Expected output:
1000
1010
10
31

```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format("%032d", a & b).replace(' ', '0'));
        System.out.println(String.format("%032d", a | b).replace(' ', '0'));
        System.out.println(String.format("%032d", a ^ b).replace(' ', '0'));
    }
}
```

This Java code reads two integers from the standard input, performs bitwise AND, OR, and XOR operations on them, and prints the results in binary format. The binary strings are zero-padded to 32 characters.

Please note that in Java, the binary representation of an integer is obtained by using the `Integer.toBinaryString(int i)` method. However, this method does not pad the string with zeros to the left to make it 32 characters long. Therefore, the `String.format` method is used to pad the string with zeros to the left to make it 32 characters long, and the `replace` method is used to replace the space characters with zeros.
<|EOT|>
