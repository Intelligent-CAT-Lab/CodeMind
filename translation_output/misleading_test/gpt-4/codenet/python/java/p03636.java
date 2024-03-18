Here is the translated code from Python to Java, which performs the same functionality as the given Python code. The input is read from the command line, and the output is the first character, the length of the string minus the first and last characters, and the last character.

```java
import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.length() <= 2) {
            System.out.println(input);
        } else {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            int count = input.length() - 2;
            
            System.out.println("" + firstChar + count + lastChar);
        }
        
        scanner.close();
    }
}
```

When you run this Java program, it reads a string from the input, calculates the abbreviation, and prints it, just like the provided Python code.

Here's how you could use the program:

Test input:
```
internationalization
```

Expected output:
```
i18n
```

Please note that there seems to be a discrepancy between the output shown in your expected output `i1n` and what the Python code you've provided actually does. The correct abbreviation for "internationalization" following the logic of the given code should be `i18n` (since there are 18 characters between 'i' and 'n'). The Java code above reflects this correction to match the logic of the Python code.
