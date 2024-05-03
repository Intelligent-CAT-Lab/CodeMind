Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        int result = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sum);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the sum of its digits, and then finds the maximum between the result of subtracting 1 from the first digit and the sum of all digits, and prints the result.
