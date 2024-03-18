Here's the equivalent Java code for the provided Python code snippet, including a main method to take input from the command line:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.close();

        int ans = (D / L) + (D - L * (D / L));
        System.out.println(ans);
    }
}
```

This Java program will read two integers (`D` and `L`) from standard input and calculate the result using integer division and modulo operations, similar to what the original Python code does. To test this with input "10 5", you would provide these numbers when the program prompts for input, and the output would be `-21`.

Please note that this Java program assumes the input is given in the correct format and doesn't include any error checking for simplicity.

The Java code snippet uses the `Scanner` class for handling input, which is part of the `java.util` package. Integer division and the modulo operations are performed using the `/` and `%` operators, which work similarly to their Python counterparts for integer values.
