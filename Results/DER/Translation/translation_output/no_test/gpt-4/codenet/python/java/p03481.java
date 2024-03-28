Below is the java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by a space
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculating the division and finding the bit length of the result
        int division = Y / X;
        int k = Integer.SIZE - Integer.numberOfLeadingZeros(division);

        // Printing the result
        System.out.println(k);
        
        scanner.close();
    }
}
```

In Java, we utilize the `Scanner` class for reading user input. Here, `Integer.numberOfLeadingZeros(division)` is used to find the number of zero bits preceding the highest-order ("leftmost") one-bit in the binary representation of the `division`, then we subtract that from the size of an integer in Java, which is 32 bits, to effectively find the bit length of the integer. Note that `Integer.bitCount(division)` could not be used directly, as it finds the number of one-bits in the binary representation, not the bit length; we need the position of the highest-order one-bit instead.
