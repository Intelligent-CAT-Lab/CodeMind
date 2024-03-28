Here's the equivalent Java code to perform the same operation as the provided Python code. In Java, we do not have a native function to map input values directly as integers like in Python. Instead, we need to handle input parsing and value conversion manually. 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Make sure to close the scanner to prevent resource leaks
        scanner.close();
    }
}
```

To run this Java program, input can be provided in the same way as the test case:

Test input:
2 2 2

Expected output:
Yes

Remember to compile the Java program before running it and provide the input in one line separated by spaces, just like in the test case.
