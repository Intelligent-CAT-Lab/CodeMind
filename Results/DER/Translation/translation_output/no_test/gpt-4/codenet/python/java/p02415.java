Here's the equivalent Java code that takes a string from standard input, swaps its case, and prints it to the standard output:

```java
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String swappedCaseString = swapCase(s);
        System.out.println(swappedCaseString);
        scanner.close();
    }

    private static String swapCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
```

This Java code does the following:
1. It imports the Scanner class for reading input from the user.
2. It defines a `SwapCase` class with a `main` method - the entry point of the program.
3. Inside the `main` method, it creates a `Scanner` object to read a line of text from the user.
4. It calls the `swapCase` method to swap the case of each character in the input string.
5. It prints the resulting string with swapped cases.
6. Finally, it closes the `Scanner` object.

The `swapCase` method uses a `StringBuilder` to efficiently construct the new string with swapped cases, iterating over each character of the input string, checking its case, and appending the swapped case character to the `StringBuilder`.
