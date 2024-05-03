Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sortedInput = new String(chars);
        if (sortedInput.charAt(0) == sortedInput.charAt(1) && sortedInput.charAt(2) == sortedInput.charAt(3) && sortedInput.charAt(0) != sortedInput.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, sorts the characters in the string, and then checks if the first two characters are the same, the second two characters are the same, and the first character is not the same as the second character. If all these conditions are met, it prints "Yes"; otherwise, it prints "No".
