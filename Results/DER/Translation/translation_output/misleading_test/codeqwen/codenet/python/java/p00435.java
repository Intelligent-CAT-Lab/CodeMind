Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                list.append('Z');
            } else if (c == 'B') {
                list.append('Y');
            } else if (c == 'A') {
                list.append('X');
            } else {
                c = (char) (c - 3);
                list.append(c);
            }
        }
        System.out.println(list.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is 'C', 'B', or 'A', it appends a corresponding character to the `StringBuilder` object `list`. If the character is not 'C', 'B', or 'A', it subtracts 3 from the ASCII value of the character and appends the resulting character to the `StringBuilder` object `list`. Finally, it prints the contents of the `StringBuilder` object `list`.
