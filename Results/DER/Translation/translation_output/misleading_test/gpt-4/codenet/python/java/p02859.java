Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int r = scanner.nextInt(); // Read the next integer from the input
        System.out.println(r * r); // Print the square of the integer
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
```

For the given test case, if you supply `2` as the input when running this Java program, it will output `4`, not `87` as mentioned in your expected output. It seems there may be a typo in the provided expected output since the code is intended to print the square of the number `r`. If the input is `2`, the output should be `2^2` which is `4`.
