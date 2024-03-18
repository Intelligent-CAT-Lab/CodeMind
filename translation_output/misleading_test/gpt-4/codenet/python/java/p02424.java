Here is the translated Python code to Java, including the necessary imports and using standard input and output:

```java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers from the input, assuming they're separated by a space
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Closing the scanner as good practice since we no longer need it
        scanner.close();

        // Performing the bitwise operations and printing the results in 32-bit binary format
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));
    }
}
```

This Java code reads two integers from the standard input, performs bitwise AND, OR, and XOR operations on them, and prints out the results in a 32-bit binary string format.

To illustrate with the provided test case where the input is '8 10', the expected outputs would be as follows:

1000 // Binary representation of 8 AND 10 (both have the 4th bit set)
1010 // Binary representation of 8 OR 10 (one or both have the 2nd or 4th bits set)
10   // Binary representation of 8 XOR 10 (only one has the 2nd bit set)
31   // We don't have this output in our Java program. It seems to be unrelated to the given Python code

It is important to note that the last output '31' is not produced by the provided Python code. Thus, it is not included in the Java translation. The first three outputs correspond to the bitwise AND, OR, and XOR of the numbers 8 and 10, respectively, represented as 32-bit binary strings. If '31' is an expected output for another operation or under another context, the Java code for producing such a result would need to be added separately.
