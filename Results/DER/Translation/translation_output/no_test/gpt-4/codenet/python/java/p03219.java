Below is the Python code translated into Java. Keep in mind that Java requires more code for user input and does not support the tuple unpacking feature as in Python, so the code structure is different:

```java
import java.util.Scanner;

public class FareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();

        int fare = ab + bc / 2;

        System.out.println(fare);
        
        scanner.close();
    }
}
```

Here's a quick breakdown of the Java version:

1. Import the `Scanner` class to allow for user input.
2. Define a `FareCalculator` class and the `main` method where the code will run.
3. Create a `Scanner` object to read from the standard input (console).
4. Read two integers from the user input and store them in `ab` and `bc`.
5. Calculate the fare by adding `ab` to half of `bc` (Note: Java uses integer division here, just like the Python code).
6. Print out the fare.
7. Close the scanner to prevent any resource leaks.
