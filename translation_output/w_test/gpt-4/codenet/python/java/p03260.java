Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Determine if both numbers are odd
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

To match the exact behavior of the Python code, you would run the Java code, input "3 1" when prompted, and the program would output "Yes".
