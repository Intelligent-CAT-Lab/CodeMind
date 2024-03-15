Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 != 0) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 != 0) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        
        System.out.println(ans);
    }
}
```

In the above Java code, I have used `Scanner` from `java.util` package to read input from the user, similar to the `input()` in Python. Additionally, since strings in Java are zero-indexed, the `charAt()` method is used to access characters at specific indices, with `s.length() - 1` being the Java equivalent of `s[-1]` in Python. The ternary conditionals have been replaced with regular if-else statements to maintain the structure from the original Python code.
