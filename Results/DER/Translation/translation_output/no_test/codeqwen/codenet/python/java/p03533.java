Here is the Java version of your Python code:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String patternString = "^A?KIHA?BA?RA?$";
        Pattern pattern = Pattern.compile(patternString);
        String S = System.console().readLine();
        Matcher matcher = pattern.matcher(S);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the console, compiles a regular expression pattern, and then uses the matcher method to check if the string matches the pattern. If it does, it prints "YES"; otherwise, it prints "NO".
