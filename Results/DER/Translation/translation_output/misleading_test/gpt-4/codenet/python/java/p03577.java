```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.length() > 8) {
            System.out.println(input.substring(0, input.length() - 8));
        } else {
            // In Python, slicing off more characters than the string has returns an empty string
            // To mimic this behavior, we print an empty string if the input is less than 8 characters
            System.out.println();
        }
        scanner.close();
    }
}
```

When you run this Java code with the test input `CODEFESTIVAL`, the expected output would be `CODE=` as it trims the last 8 characters from the input. Java requires more boilerplate code, including imports and class/method definitions. Unlike Python, Java's `Scanner` class is used for obtaining input from the user, and the string manipulation is performed using the `substring` method from Java's `String` class.
