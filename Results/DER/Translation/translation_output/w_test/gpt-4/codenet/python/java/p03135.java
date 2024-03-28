Here is the Java translation of your provided Python code. Please note that Java handles input and output in a different way than Python. I'll use `Scanner` class for input and `System.out.println` for output. The `Scanner` class is used for parsing tokens from a stream of input.

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers, t and x, from the input
        int t = scanner.nextInt();
        int x = scanner.nextInt();

        // Since the division should result in a floating point number,
        // at least one operand should be cast to double before the operation.
        double result = (double)t / x;

        // Output the result with a newline
        System.out.printf("%.10f\n", result);

        // Close the scanner
        scanner.close();
    }
}
```

You can run the above Java code providing "8 3" as input and you would get approximately "2.6666666667" as the expected output. The `printf` function is used to format the output to 10 decimal places, similar to the given Python code's print output.
