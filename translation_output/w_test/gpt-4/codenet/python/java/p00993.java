Certainly! Below is the Java translation of the provided Python code.

For the reduction operation that multiplies all numbers in the range [1, 1500], we would use a loop in Java, as there is no direct equivalent to Python's `reduce` function in standard Java. For reading the input, we can use a `Scanner` object. Here's the converted code:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculate the product of all numbers from 1 to 1500 and add 2
        BigInteger product = BigInteger.ONE; // To hold large product value
        for (int i = 1; i <= 1500; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        product = product.add(BigInteger.valueOf(2)); // Adding 2 to the product
        System.out.println(product);

        // Use Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= inputNumber; i++) {
            System.out.println(i + 1); // Print each number incremented by 1
        }
        scanner.close(); // Close the scanner object
    }
}
```

Keep in mind that the product of numbers from 1 to 1500 is an extremely large value and cannot be held in a standard `int` or `long` data type, hence `BigInteger` is used. Also, unlike Python which has built-in big number arithmetic, Java requires explicit use of the `BigInteger` class for such operations.

A test input of `2` will result in the expected output of the product (a very large number that won't be displayed here) followed by numbers `2` and `3` on separate lines.
