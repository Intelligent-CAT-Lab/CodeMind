Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
            }
        }
        System.out.println(myStr.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is a '0' or '1', it appends it to the `myStr` StringBuilder. If the character is a 'B' and the length of `myStr` is not zero, it deletes the last character from `myStr`. Finally, it prints out the contents of `myStr`.
