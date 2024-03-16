Here's the translation of your Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String N = scanner.nextLine();

        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

In this Java code, we import the `Scanner` class to take input from the user. We then check if the input string contains the character "7" and print the corresponding message to the console. We also ensure to close the scanner to prevent resource leaks.
