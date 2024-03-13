<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

@@ Response
Here is the equivalent Java code:

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
                matcher.appendReplacement(sb, "apple");
            } else {
                matcher.appendReplacement(sb, "peach");
            }
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, replaces "apple" with "apple" and "peach" with "peach", and then prints the result.<｜end▁of▁sentence｜>
