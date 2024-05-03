Here is the Java equivalent of the Python code you provided:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String S = "KIHBR";
        String pattern = "^A?KIHA?BA?RA?$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(S);
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, compiles a regular expression pattern, and then uses the matcher method to check if the string matches the pattern. If it does, it prints "YES", otherwise it prints "NO".
