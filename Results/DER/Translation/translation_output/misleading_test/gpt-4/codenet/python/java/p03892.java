Here's the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        System.out.println(calculateResult(a, b, c, d));
    }

    private static int calculateResult(int a, int b, int c, int d) {
        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) return 0;
        int m = gcd(Math.max(h, w), Math.min(h, w));
        return h + w - m;
    }
}
```

And here's how you might run the test case and check the output:

```java
public class TestMain {
    public static void main(String[] args) {
        // Store the original system input stream to restore it later
        InputStream originalIn = System.in;

        // Test input as a byte array (your input string would go here)
        String input = "1 1 3 4\n";
        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        
        // Set System.in to our new input stream
        System.setIn(testInput);

        // Run the main method of our program
        Main.main(new String[0]);

        // Restore the original system input stream
        System.setIn(originalIn);
    }
}
```

In this `TestMain` class, we're capturing a test input and providing it to `System.in`, then running the `main` method of our `Main` class and restoring `System.in` afterwards. The expected output should be printed to the console.
