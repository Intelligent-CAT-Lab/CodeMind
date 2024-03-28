Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

### Response:
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "I like apple and peach.";
        String output = "";
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String matched = matcher.group(0);
            if (matched.equals("apple")) {
                output += "apple";
            } else {
                output += "peach";
            }
        }
        System.out.println(output);
    }
}
```<|endoftext|>
