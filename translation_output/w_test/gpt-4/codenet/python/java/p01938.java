Here's the translated Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);

            if (Now < Next) {
                // Do nothing
            } else {
                ans += 1;
            }
            Now = Next;
        }

        System.out.println(ans);
    }
}
```

This Java code takes a string input from the user and outputs the number of times the letter in the string doesn't come in alphabetical order, just like the provided Python code. Make sure you have the correct package if required for your project, and this code will work in an environment where you can provide Standard Input and handle Standard Output, which is a common setup for coding challenges and contests.
