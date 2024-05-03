Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder my_str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                my_str.append(c);
            } else if (c == 'B' && my_str.length() != 0) {
                my_str.deleteCharAt(my_str.length() - 1);
            }
        }
        System.out.println(my_str.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is '0' or '1', it appends it to the `my_str` StringBuilder. If the character is 'B' and the length of `my_str` is not zero, it deletes the last character from `my_str`. Finally, it prints out the contents of `my_str`.
