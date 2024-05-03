Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over the string, comparing each character to the next one. If they are different, it increments the `ans` variable. Finally, it prints out the value of `ans`.
