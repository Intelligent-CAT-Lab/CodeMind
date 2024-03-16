Here's the translated Java code that achieves the same functionality as the provided Python script:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers n and m separated by a space
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Create an array of strings with length n, all initialized to "0"
        String[] points = new String[n];
        Arrays.fill(points, "0");
        
        // Update the second half of the array with the value of m converted to a string
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = Integer.toString(m);
        }
        
        // Join the array elements with spaces between them and print the result
        System.out.println(String.join(" ", points));
        
        scanner.close();
    }
}
```

This Java code does the following:

1. Import the necessary classes.
2. Define the main class and method.
3. Create a `Scanner` instance to read from standard input.
4. Read two integers `n` and `m` from the input.
5. Create and initialize an array of strings `points` with elements `"0"`.
6. Loop over the second half of the `points` array and set each element to the string representation of `m`.
7. Join the `points` array into a string with spaces between elements and print it to the standard output.
8. Close the scanner to prevent resource leaks.
