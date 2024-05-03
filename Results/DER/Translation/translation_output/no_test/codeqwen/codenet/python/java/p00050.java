Here is the Java version of your Python code:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = System.console().readLine();
        System.out.println(replaceAppleOrPeach(input));
    }

    public static String replaceAppleOrPeach(String input) {
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            if (matcher.group().equals("apple")) {
                matcher.appendReplacement(sb, "apple");
            } else {
                matcher.appendReplacement(sb, "peach");
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
```

This Java code does the same thing as your Python code. It reads a line from the console, then replaces "apple" and "peach" with "apple" and "peach" respectively. The `replaceAppleOrPeach` function uses Java's `Pattern` and `Matcher` classes to find and replace the words. The `appendReplacement` and `appendTail` methods are used to construct the final string.
