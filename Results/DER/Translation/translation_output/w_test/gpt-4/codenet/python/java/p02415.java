Below is the translation of the provided Python code to Java. The Java code will replicate the behavior of swapping the case of all characters in the input string, just as the Python `swapcase()` function does.

```java
import java.util.Scanner;

public class SwapCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        String swappedString = swapCase(s);
        System.out.println(swappedString);
        scanner.close();
    }

    private static String swapCase(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

This code defines a Java class `SwapCaseConverter` with a `main` method that reads input from the user through the `Scanner` class and then prints the transformed string where the case of each character has been swapped.

To test the code with the input "fAIR, LATER, OCCASIONALLY CLOUDY.", you would enter that string when prompted after running the program. The expected output would be "Fair, later, occasionally cloudy.".
