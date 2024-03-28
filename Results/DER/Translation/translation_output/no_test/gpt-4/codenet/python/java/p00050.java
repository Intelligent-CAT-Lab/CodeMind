Certainly! Below is the translated Python code to Java:

```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FruitReplacer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input:");
        String input = scanner.nextLine();
        scanner.close();

        // Define the pattern to match "apple" or "peach"
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);

        // Use a StringBuffer to hold the result
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            // Replace "apple" with "peach" and "peach" with "apple"
            matcher.appendReplacement(result, matcher.group().equals("apple") ? "peach" : "apple");
        }
        // Append the rest of the input
        matcher.appendTail(result);

        // Output the result
        System.out.println(result);
    }
}
```

Note that unlike Python's functional replacement with `lambda`, Java requires a more manual approach with `Matcher.find()` and `Matcher.appendReplacement()`. The `Scanner` class is used to obtain the standard input from the user.

When running this Java program, it will wait for user input, replace "apple" with "peach" and "peach" with "apple" in the given input string, and then print the result to the console.
