Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(f(s));
    }

    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks each character in the string to see if it is the same as the next character. If it finds a character that is the same as the next character, it returns "Bad". If it doesn't find any such characters, it returns "Good".
