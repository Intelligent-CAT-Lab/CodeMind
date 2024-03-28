<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
1000
11111111111111111111111111110111
10000
100
17

```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1<<32)-1;
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n<<1)& mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n>>1)& mask)).replace(' ', '0'));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, calculates the bitwise operations, and prints the results in binary format. The `String.format` method is used to format the binary string to 32 characters, and the `replace` method is used to replace spaces with zeros.
<|EOT|>
