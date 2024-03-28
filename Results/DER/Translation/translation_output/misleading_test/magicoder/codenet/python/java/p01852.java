<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
14

```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n != 0 ? Integer.toBinaryString(n).length() : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, converts it to binary, and then prints the length of the binary string. If the input number is 0, it prints 0.<｜end▁of▁sentence｜>
