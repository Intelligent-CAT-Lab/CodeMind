

```
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        String output = matcher.replaceAll(m -> m.group(0).equals("apple") ? "apple" : "peach");
        System.out.println(output);
    }
}

```
Upvotes: 0 
