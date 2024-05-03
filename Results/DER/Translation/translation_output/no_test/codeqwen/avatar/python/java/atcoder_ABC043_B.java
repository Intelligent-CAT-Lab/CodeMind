Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String my_str = "";
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == 'B' && my_str.length() != 0) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is '0' or '1', it adds it to the `my_str` string. If the character is 'B' and `my_str` is not empty, it removes the last character from `my_str`. Finally, it prints out `my_str`.
