Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = swapCase(input);
        System.out.println(output);
    }

    public static String swapCase(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                output.append(Character.toLowerCase(c));
            } else {
                output.append(Character.toUpperCase(c));
            }
        }
        return output.toString();
    }
}
```

This Java program reads a string from the user, then calls the `swapCase` method to swap the case of each character in the string. The `swapCase` method iterates over each character in the input string, checks if it is uppercase or lowercase, and appends the opposite case character to the output string. Finally, the program prints the output string.
