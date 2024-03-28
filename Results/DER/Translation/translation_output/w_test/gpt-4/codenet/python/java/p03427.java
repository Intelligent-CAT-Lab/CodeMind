Here's the Java code that accomplishes the same task as the Python code provided. To simulate getting input and printing the output, I'm using `Scanner` for input and `System.out.println` for output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(Math.max(getMaxValue(n), getSumOfDigits(n)));
        sc.close();
    }

    private static int getMaxValue(String n) {
        // Subtract 1 from the first digit and add 9 for each remaining digit
        return (n.charAt(0) - '0' - 1) + 9 * (n.length() - 1);
    }

    private static int getSumOfDigits(String n) {
        // Sum all the digits
        int sum = 0;
        for (char digit : n.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}
```

In this Java code, `getMaxValue` calculates the maximum possible sum when changing all but the first digit to 9, taking into account that we subtracted 1 from the first digit. `getSumOfDigits` simply calculates the sum of the digits of the input string. The `main` method reads the input as a string, calculates both values, and prints the maximum of the two.

For the test input of "100", this code should print "18" as expected.
