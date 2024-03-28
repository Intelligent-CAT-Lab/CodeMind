Certainly! Below is the Java equivalent of the provided Python code. Please note that Java doesn't have a built-in console input method as straightforward as Python's `raw_input()`, so we'll employ `Scanner` to read the input from the user. Additionally, Java requires explicit typing, so we'll iterate over the characters of the string.

```java
import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(f(s));
        scanner.close();
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

This Java code defines a `StringCheck` class with a `main` method to handle user input and output. It also contains the `f` method, which takes a string `s` and checks consecutive characters for equality, returning "Bad" if any are found and "Good" otherwise. Remember to compile this Java class before running it.
