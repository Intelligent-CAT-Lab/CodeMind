Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int result = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sum(n));
        System.out.println(result);
    }

    public static int sum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return sum;
    }
}
```

This Java program does the same thing as the Python code. It reads a string input from the user, calculates the maximum value between the result of subtracting 1 from the first digit and adding 9 times the length of the string minus 1, and the sum of all digits in the string, and then prints the result.
