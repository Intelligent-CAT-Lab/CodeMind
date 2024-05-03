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
            // System.out.println(s + " " + Now + " " + Next);

            if (Now < Next) {
                pass();
            } else {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }

    public static void pass() {
        // This is a placeholder for the Python pass statement.
        // In Java, there is no direct equivalent, so we use an empty method.
    }
}
```

Please note that the `pass()` method is a placeholder for the Python `pass` statement. In Java, there is no direct equivalent, so we use an empty method.
