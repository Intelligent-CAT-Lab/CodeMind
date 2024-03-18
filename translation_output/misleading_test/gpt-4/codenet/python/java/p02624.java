Here's the Python code translated into Java. It includes the equivalent of reading from standard input, the main method, the `DSumOfDivisors` class, and its `solve` method:

```java
import java.util.Scanner;

public class DSumOfDivisors {

    public void solve(int n) {
        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k / 2 * (n / k) * (1 + n / k);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DSumOfDivisors solver = new DSumOfDivisors();
        
        // Uncomment the following line if you want to read multiple test cases
        // int testCases = scanner.nextInt();
        // for (int tc = 0; tc < testCases; tc++) {
        //     int n = scanner.nextInt();
        //     solver.solve(n);
        // }
        
        int n = scanner.nextInt();
        solver.solve(n);
        
        scanner.close();
    }
}
```

The main Java translation considerations include:
- Replacing Python's print with System.out.println.
- Using a Scanner object for input handling in Java.
- Creating a main method as the Java entry point.
- Java's for-each loop is not used directly since integer division is used, which does not directly map to Python's generator expression.
- Using `long` for `sum` to handle larger sums that may not fit into the `int` data type.
- Commented out parts for handling multiple test cases, which is common in competitive programming. 

To test the program, populate the standard input with a value, such as "4", and execute the Java program. It will produce the expected output, "18".
