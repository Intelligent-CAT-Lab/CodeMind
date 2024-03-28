Here's the equivalent Java code that performs the same operation as the provided Python script:

```java
import java.util.Scanner;

public class AbbreviationConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word for abbreviation:");
        String input = scanner.nextLine();
        scanner.close();
        
        if (input.length() <= 2) {
            System.out.println(input);
        } else {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            int count = input.length() - 2;
            
            System.out.println(firstChar + "" + count + lastChar);
        }
    }
}
```

The Java program uses a Scanner to read the word from standard input. It then calculates the length of the middle section by subtracting 2 (the first and last characters) and prints the abbreviation.

Please note that Java does not have an equivalent to Python's multiple assignment or the splat operator (`*`). Additionally, Java is statically typed, so we declare variable types explicitly. Also, Java doesn't have a built-in print function, so we use `System.out.println` instead.

To run the example, compile the Java code with `javac AbbreviationConverter.java` and then run with `java AbbreviationConverter`. When prompted, input `internationalization`, and the output will be `i18n`.
