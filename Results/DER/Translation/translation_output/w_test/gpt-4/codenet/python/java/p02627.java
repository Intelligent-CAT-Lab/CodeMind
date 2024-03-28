Below is the Java equivalent for the provided Python code. In Java, you would have to import the `Scanner` class for taking input from the user, and you would use the methods `Character.isUpperCase()` and `Character.isLowerCase()` to check whether a character is in uppercase or lowercase respectively.

```java
import java.util.Scanner;

public class CheckLetterCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.length() == 1) {
            char n = input.charAt(0);
            
            if (Character.isUpperCase(n)) {
                System.out.println("A");
            } else if (Character.isLowerCase(n)) {
                System.out.println("a");
            }
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
```

You can run this program, and when you provide the test input 'B' it should output 'A' as expected.

Please note that in this Java snippet, an additional check has been added to ensure that only a single character is input. If the input string length is not equal to 1, it will print "Invalid input". This is a basic validation measure and might need to be adjusted based on the exact specifications required for the input handling. In the original Python code, there is no explicit check for the length of the input because `input()` would typically read the input until a newline is encountered.
