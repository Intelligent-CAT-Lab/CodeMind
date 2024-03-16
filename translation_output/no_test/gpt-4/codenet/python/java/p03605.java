Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        if (userInput.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

This Java code uses the `Scanner` class to receive user input from the standard input and checks if the input string contains the character '9'. It prints "Yes" if it does and "No" otherwise.
