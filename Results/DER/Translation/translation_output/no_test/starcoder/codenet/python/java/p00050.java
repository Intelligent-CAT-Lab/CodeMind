<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern p = Pattern.compile("(apple|peach)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            input = input.replaceFirst(m.group(0), m.group(0) == "apple"? "orange" : "grapefruit");
        }
        System.out.println(input);
    }
}
```
<|endoftext|>
