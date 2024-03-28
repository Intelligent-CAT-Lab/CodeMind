Here is the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input in the same line and split them into two parts
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Assigning each part to specific string variables
        String S = parts[0];
        String T = parts[1];

        // Concatenating and printing as per the expected output
        System.out.println(T + "!" + S);

        scanner.close();
    }
}
```

This Java code imports the Scanner class for input operations, reads the input line, splits it, and then prints out the concatenated result as the Python code does with an exclamation mark (!) added between the two strings, according to the provided expected output. Remember that Java needs more boilerplate code than Python for such simple tasks due to its static type system and lack of built-in tuple unpacking.
