Here is the equivalent Java code that takes two integers as input and calculates the result just like the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by space
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        scanner.close(); // Close the scanner

        // Calculating the result
        int result = (n - 1) * (m - 1);

        // Printing the result
        System.out.println(result);
    }
}
```

This code uses `Scanner` to read the two integers `n` and `m` from standard input. After reading the values, it closes the `Scanner` to prevent resource leaks. It then calculates the result by subtracting `1` from each number, multiplying the two results together, and finally prints the result to the standard output.
