Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);

            if (Now < Next) {
                // do nothing
            } else {
                ans += 1;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. For each character, it finds its index in the string "ABCDEFGHIJKLMNOPQRSTUVWXYZ". If the index of the current character is less than the index of the previous character, it increments the counter `ans`. Finally, it prints the value of `ans`.
