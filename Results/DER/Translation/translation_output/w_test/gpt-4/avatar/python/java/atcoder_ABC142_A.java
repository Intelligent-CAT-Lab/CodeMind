Below is the translated Python code into Java. Make sure to include the necessary imports for I/O handling in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.printf("%.10f%n", 0.5);
        } else {
            System.out.printf("%.10f%n", (double) (N + 1) / N / 2);
        }

        scanner.close();
    }
}

```

To run this Java code, you would need to compile it with a Java compiler and then execute the compiled class. The `Scanner` class is used for input handling, reading `N` as an integer from standard input. The `printf` function is used to format the output with 10 decimal points, similar to the `print` function's formatting in Python.
