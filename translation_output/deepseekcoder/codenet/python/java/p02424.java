<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

        System.out.println(String.format("%032d", Integer.toBinaryString(a & b)));
        System.out.println(String.format("%032d", Integer.toBinaryString(a | b)));
        System.out.println(String.format("%032d", Integer.toBinaryString(a ^ b)));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, performs bitwise AND, OR, and XOR operations on them, and prints the results in binary format. The `String.format("%032d", ...)` part ensures that the binary strings are zero-padded to 32 digits.
<|EOT|>
