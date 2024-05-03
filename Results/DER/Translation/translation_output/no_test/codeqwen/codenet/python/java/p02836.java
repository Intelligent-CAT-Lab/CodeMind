Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int n = s.length() - 1;
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the length of the string, and then iterates over the first half of the string. If the character at the current index is not equal to the character at the corresponding index from the end of the string, it increments the `ans` variable. Finally, it prints the value of `ans`.
