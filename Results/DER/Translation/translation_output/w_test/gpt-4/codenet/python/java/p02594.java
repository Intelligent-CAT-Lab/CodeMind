Here is the translated code from Python to Java, including a simple test case as specified:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer value from the user
        int X = scanner.nextInt();
        
        // Check the condition and print "Yes" or "No"
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

// Test input: 25
// Expected output: No
```

To test this Java program, you would compile and run it, input the number `25`, and the program should output `No`. Remember that unlike in Python, in Java you need to compile the source code into bytecode before it can be run by the Java Virtual Machine (JVM).
