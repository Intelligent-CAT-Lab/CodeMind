Below is the translation of the Python code to Java. I've included a simple class with a `main` method to allow for command-line input. Please note that the Java version requires standard error handling for input/output operations, and the `Scanner` class is used for reading input from the user.

```java
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String n = scanner.nextLine();
        int tmp = 0;

        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }

        System.out.println(tmp == 0 ? "Yes" : "No");

        scanner.close();
    }
}
```

This Java program will work similarly to your Python code. When you enter a number, it will check if the sum of its digits is divisible by 9 and print "Yes" if it is, or "No" otherwise. It reads input as a string and then iterates over each character, converting it into an integer for the calculation. Remember to compile and run this code in an environment where Java is installed.
