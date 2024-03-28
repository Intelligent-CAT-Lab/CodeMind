Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else if (a > 0) {
            System.out.println("Positive");
        }
        
        scanner.close();
    }
}
```

This Java program assumes that the input is provided in a single line, as depicted in the 'Test input' section. The user inputs are being read with a `Scanner`. The `Scanner` reads the input line, splits it on spaces, and then converts the two numeric strings into integers `a` and `b`. The if-else structure is then used to achieve the same control flow as in the Python code and determine the output according to the specified conditions.
