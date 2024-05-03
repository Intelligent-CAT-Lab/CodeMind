Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 == 1) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the first and last characters are the same, and then determines whether the length of the string is odd or even. Based on these conditions, it prints out "First" or "Second".
