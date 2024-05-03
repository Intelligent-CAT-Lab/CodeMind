Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sum(n)));
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

This Java code does the same thing as your Python code. It reads a string input from the user, calculates the maximum value between the first digit minus 1 plus 9 times the length of the string minus 1 and the sum of all digits in the string, and then prints the result.
