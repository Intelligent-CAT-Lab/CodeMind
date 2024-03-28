Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int result = 800 * N - 200 * (N / 15);
        
        System.out.println(result);
        
        scanner.close();
    }
}
```

The Java code includes the necessary import of the `Scanner` class for reading user input. It creates an instance of the scanner to read an integer `N` from the standard input, calculates the desired expression, prints the result, and finally closes the scanner to avoid resource leaks.
