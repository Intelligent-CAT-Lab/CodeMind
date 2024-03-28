Below is the translation of the provided Python code to Java. The Java code takes input from the user through the `Scanner` class, processes it according to the given logic, and then outputs the result formatted to 12 decimal places using `String.format`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double n = scanner.nextDouble();
        scanner.close();

        // Calculate the output based on the given Python logic
        double result = (n * Math.sqrt(2)) < (Math.floor(n) + 1) ? (Math.floor(n) + 1) : (n * Math.sqrt(2));

        // Output the result formatted to 12 decimal places
        System.out.println(String.format("%.12f", result));
    }
}
```

To run the Java code, you need to compile it and then execute the compiled class providing the test input `1.000`. You can use the following command lines to compile and run the program if saved in a file named `Main.java`:

```bash
javac Main.java
java Main
```

When prompted, enter the input `1.000` to get the expected output `2.000000000000`.
