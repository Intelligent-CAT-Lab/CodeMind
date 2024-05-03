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

This Java code does the same thing as your Python code. It reads a string from the user, then calls the `f` function to check if the string is "Good" or "Bad". The `f` function iterates over the string, comparing each character with the next one. If it finds two consecutive identical characters, it returns "Bad". If it doesn't find any, it returns "Good".
