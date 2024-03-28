Here's the equivalent Java code for the Python code snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        // Swap the values
        int A = Z;
        int B = X;
        int C = Y;

        // Print the result
        System.out.println(A + " " + B + " " + C);
        
        scanner.close();
    }
}
```

To test the Java code with the input `1 2 3`, you would compile and run the `Main` class, enter `1 2 3` when prompted, and expect the output `3 1 2`.
