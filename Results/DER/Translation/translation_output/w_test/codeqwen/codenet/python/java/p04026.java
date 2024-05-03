Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + " " + (i + 2));
                return;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + " " + (i + 3));
                return;
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks each character and the next two characters to see if they are the same. If it finds a match, it prints the index of the first character and the index of the second character (or the third character, if it's a match of three characters) and exits the program. If it doesn't find a match after checking all possible pairs of characters, it prints -1 for both indices.
