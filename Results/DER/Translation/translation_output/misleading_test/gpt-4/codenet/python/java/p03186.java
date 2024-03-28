Below is the Java equivalent of the provided Python code. This Java code reads three integers from standard input (assuming the inputs are provided space-separated as in the Python sample), and then executes the conditional logic to produce the output accordingly:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from standard input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
        
        // Close the scanner
        scanner.close();
    }
}

// Example usage from the command line:
// Input: 3 1 4
// Expected output: -35
```

To run a Java program with test input through a command line or an IDE, you would first compile the `Main.java` file, and then execute the `Main` class while providing the test input:

1. Save the above code in a file named `Main.java`.
2. Compile the code using `javac Main.java`.
3. Run the code with `java Main`, and then type the input (`3 1 4`) into the console followed by an Enter key.
4. You will see the expected output `-35` printed to the console.

Note that the expected output provided in the problem statement appears incorrect for the given test input and the given code logic. The Python code, when provided with input `3 1 4`, will not output `-35`. It will output `5` because `c <= a + b + 1` resolves to `4 <= 3 + 1 + 1`, which is `true`, and then it prints `b + c`, which is `1 + 4` equaling `5`.
