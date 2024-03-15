Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the inputs
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();

        // Perform the conditional checks similar to the Python code
        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }

        scanner.close(); // Close the scanner
    }
}
```

Make sure to import `java.util.Scanner` for taking inputs from the user. The code above reads three integers separated by space (like the `input().split()` in Python), then checks the conditions and prints the output accordingly.
