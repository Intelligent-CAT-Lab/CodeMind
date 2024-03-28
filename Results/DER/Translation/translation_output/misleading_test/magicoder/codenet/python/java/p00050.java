<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
th] cost! ofq >one a.pze i8s hixgher than t[_I o ne each.

```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group().equals("apple")) {
                matcher.appendReplacement(sb, "a.pple");
            } else {
                matcher.appendReplacement(sb, "p.each");
            }
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
```

This Java code uses the `java.util.regex` package to compile a regular expression that matches either "apple" or "peach". It then uses this pattern to create a `Matcher` object that can be used to find matches in the input string.

The `Matcher.find()` method is used to find the next match in the input string. If a match is found, the `Matcher.group()` method is used to get the matched string. If the matched string is "apple", it is replaced with "a.pple" and if it is "peach", it is replaced with "p.each". The `Matcher.appendReplacement()` method is used to append the replacement string to the `StringBuffer`, and `Matcher.appendTail()` is used to append the rest of the input string to the `StringBuffer`.

Finally, the `StringBuffer` is converted to a string and printed.<｜end▁of▁sentence｜>
