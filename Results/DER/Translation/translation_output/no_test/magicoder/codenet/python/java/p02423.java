<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n << 1) & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n >> 1) & mask)).replace(' ', '0'));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, creates a mask, and then prints the binary representation of the number, its bitwise NOT, the number shifted left by one, and the number shifted right by one. The `String.format` method is used to format the binary string to have leading zeros up to 32 bits. The `replace` method is used to replace spaces with zeros.<｜end▁of▁sentence｜>
