Here is the equivalent Java code for the provided Python code. The Java code will use a `Scanner` object to capture user input, and will calculate the sum of numbers up to `n` using the formula `(n + 1) * n / 2`.

```java
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println((int)((n + 1L) * n / 2));
        scanner.close();
    }
}
```

Some important notes about the conversion:

1. Java requires explicit type declaration, so `n` is declared as `int`.
2. The use of `System.out.print` and `System.out.println` in Java is similar to `print` in Python for displaying output to the console.
3. Java does not infer types, so `int` is used to ensure the input is read as an integer.
4. The `Scanner` is used for getting user input from the console in Java.
5. Java requires the main method to be enclosed in a class, so I have named the class `SumOfNumbers`.
6. To avoid any overflow issue when multiplying `n` and `(n + 1)` for larger values of `n`, I cast `n` to a `long` before the multiplication (using `n + 1L`), which ensures the operation is done using 64-bit integers.
7. Java requires explicit resource management, so it is good practice to close the `Scanner` after it is no longer needed.
