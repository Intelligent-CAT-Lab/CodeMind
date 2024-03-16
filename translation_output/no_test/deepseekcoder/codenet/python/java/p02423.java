<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1<<32)-1;
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n<<1) & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n>>1) & mask)).replace(' ', '0'));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates bitwise operations, and prints the results in binary format. The `String.format` method is used to format the binary string to have leading zeros until it reaches 32 characters. The `replace` method is used to replace spaces with zeros.
<|EOT|>
