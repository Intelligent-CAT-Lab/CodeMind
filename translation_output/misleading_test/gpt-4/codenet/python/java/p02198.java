Here is the translation of your Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Calculate and print the product
        System.out.println(N * M);

        // Close the scanner
        scanner.close();
    }
}
```

To run the provided test case (3 4) with this Java program, you would execute the program and enter "3 4" when prompted for input. The expected output would be:

```
-8
```

Note: The expected output of `-8` does not correspond to the multiplication of `3*4`, which should be `12`. If the expected output of `-8` is indeed correct for some implied context not provided in the question, then the Java code will need to be adjusted to match whatever specific operation would result in `-8`. Please clarify if the expected output is based on additional operations not included in the provided Python example.
