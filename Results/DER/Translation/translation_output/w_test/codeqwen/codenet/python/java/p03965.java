Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println((s.length() / 2) - countCharacter(s, 'p'));
    }

    private static int countCharacter(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'p' characters in the string, and then subtracts this count from half the length of the string. The `countCharacter` method is a helper method that counts the number of occurrences of a character in a string.
