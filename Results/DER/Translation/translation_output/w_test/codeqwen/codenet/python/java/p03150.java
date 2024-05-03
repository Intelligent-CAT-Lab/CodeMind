Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                String substring = S.substring(i, j + 1);
                if (substring.equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            String substring = S.substring(i, i + 8);
            if (substring.equals("keyence")) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks all possible substrings of the string to see if they are equal to "keyence". If it finds a match, it prints "YES" and exits the program. If it doesn't find a match after checking all possible substrings, it prints "NO".
