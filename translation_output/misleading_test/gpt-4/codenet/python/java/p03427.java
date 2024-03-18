Below is the Java equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(Math.max((int)(n.charAt(0) - '0') - 1 + 9 * (n.length() - 1), sumOfDigits(n)));
        scanner.close();
    }

    private static int sumOfDigits(String n) {
        int sum = 0;
        for (char digit : n.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}
```

To test the above code, you would run the `main` method, enter `100` when prompted, and expect to see `-13` printed to the console. This Java code reads a number as a `String`, finds the maximum between two calculations (similar to the Python code), and prints the result.
