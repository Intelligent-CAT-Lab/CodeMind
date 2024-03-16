Here is the equivalent Java code for the given Python script, translated using Java's Stream API for the reduction operation and a `Scanner` object for input handling:

```java
import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculating the factorial-like reduction operation
        BigInteger result = IntStream.rangeClosed(1, 1500) // Replacing the Python range with a Java IntStream for the numbers 1-1500
                .mapToObj(BigInteger::valueOf) // Convert each int to a BigInteger
                .reduce(BigInteger.ONE, BigInteger::multiply); // Perform the multiplication reduction
        System.out.println(result.add(BigInteger.valueOf(2))); // Add 2 to the result and print

        // Reading input from the user and printing numbers
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Getting the integer input
        scanner.close(); // Closing the scanner to prevent resource leak

        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1); // Output each number incremented by 1
        }
    }
}
```

Please note that the reduction operation in the Python code calculates a factorial-like product of all integers from 1 to 1500 and then adds 2 to the result. In Java, `BigInteger` is used to handle the possibly very large numbers that result from this sequence of multiplications.

In the input loop, Java's `Scanner` is used to read an integer from standard input, which is equivalent to Python's `raw_input()` (albeit `raw_input()` returns a string, so you would typically wrap it with `int()` to get the integer value).

Lastly, `IntStream` is used in place of Python's list comprehension and `reduce()` for producing the factorial-like result. The `reduce()` operation in Java takes two parameters: an identity value and an accumulator function. Here, `BigInteger.ONE` is the identity value, and `BigInteger::multiply` is the accumulator function that defines the operation to perform on the elements of the stream.
