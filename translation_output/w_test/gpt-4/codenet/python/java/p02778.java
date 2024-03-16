Sure, here is the Python code translated to Java. I've also included a simple test case to illustrate its usage:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a string input
        String s = scanner.nextLine();
        
        // Iterate over the characters in the string and print 'x'
        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
        
        scanner.close();
    }
}

// Test input:
// sardine
// Expected output:
// xxxxxxx
```

To run the test case, you'd compile and execute the `Main` class in the Java programming environment and then input the test string "sardine" when prompted. The expected output would be a series of 'x' characters, with the same number of characters as there are in the input string.
