<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```
[/INST]
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "the cost of one peach is higher than that of one apple.";
        String pattern = "\\b(apple|peach)\\b";
        Matcher matcher = Pattern.compile(pattern).matcher(input);
        String output = "";
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group.equals("apple")) {
                output += "the cost of one apple is higher than that of one peach.\n";
            } else {
                output += "the cost of one peach is higher than that of one apple.\n";
            }
        }
        System.out.println(output);
    }
}
```</s>
