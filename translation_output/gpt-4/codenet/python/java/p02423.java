Below is the equivalent Java code for your provided Python script:

```java
import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;

        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString((n << 1) & mask)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString((n >>> 1) & mask)).replaceAll(" ", "0"));

        scanner.close();
    }
}
```

Things to note:
1. Java doesn't have built-in support for binary string formatting like Python, so we use `Integer.toBinaryString()` to convert the integer to a binary string and then apply `String.format()` with `%32s` to pad the beginning with spaces to ensure it is 32 characters long. After that, `replaceAll(" ", "0")` is used to convert the spaces into zeros for the padding.

2. The `Scanner` class is used for input in Java, similar to `input()` in Python.

3. Unlike Python, where integers can be of arbitrary size, Java `int` type has a fixed size of 32 bits, so we don't explicitly mask when shifting left. However, when shifting right unsigned (`>>>`), we must use a mask to ensure no sign extension takes place for negative numbers.

4. The bitwise complement operator `~` will produce a negative number when applied to a positive number due to sign extension. Therefore, we apply a mask `(1 << 32) - 1` to only consider the lower 32 bits and ignore sign extension.

5. Remember that this code uses Java's `Scanner` which reads from the standard input stream (typically, the console) and will block the program's execution until an integer is entered by the user followed by a newline (typically by pressing Enter).
