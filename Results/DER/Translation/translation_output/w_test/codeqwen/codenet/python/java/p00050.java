Here is the Java version of your Python code:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        System.out.println(replaceWords(input));
    }

    public static String replaceWords(String input) {
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(0).equals("apple") ? "peach" : "apple");
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}
```

This Java code does the same thing as your Python code. It uses the `Pattern` and `Matcher` classes from the `java.util.regex` package to find and replace words in the input string. The `replaceWords` method is a helper method that performs the replacement. It uses a `StringBuffer` to build the output string. The `appendReplacement` and `appendTail` methods are used to insert the replaced words into the output string.
