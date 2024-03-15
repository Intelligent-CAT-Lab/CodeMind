<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```
[/INST]
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "apple";
        String pattern = "apple|peach";
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if (m.find()) {
            fruits.add(m.group(0));
        }
        System.out.println(fruits);
    }
}
```</s>
