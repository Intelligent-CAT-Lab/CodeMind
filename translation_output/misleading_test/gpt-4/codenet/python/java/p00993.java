Here's the translation of the provided Python code to Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // Calculate the factorial of 1500 and add 2, then print the result
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 1500; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial.add(BigInteger.valueOf(2)));

        // Reading input from the user
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Print i+1 for each i in range 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
        scanner.close();
    }
}
```

The Java code above first calculates the factorial of 1500 using a `BigInteger` to handle the large result. Then it adds 2 to the resulting factorial and prints it out. After that, it reads an integer `n` from the standard input and prints `i + 1` for each `i` from 1 to `n` (inclusive).

To run the provided test case in Java, you would need to provide the input `2` to `System.in` before executing the main method. Here's how the output would look for the test input `2`:

```
Expected output:
8
3
``` 

The output for the factorial of 1500 plus 2 is too large to display here, but the code will compute and print the correct value when run.

The Java code uses the `java.util.Scanner` class for reading user input, which is the common way to handle input in Java. It also uses `java.math.BigInteger` for handling very large integer computations that exceed the limit of the primitive data types such as `int` and `long`.
