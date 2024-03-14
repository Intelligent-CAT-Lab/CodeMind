<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

### Response:
```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(apple|peach)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group().equals("apple")) {
                matcher.appendReplacement(stringBuffer, "0");
            } else {
                matcher.appendReplacement(stringBuffer, "1");
            }
        }
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, replaces "apple" with "0" and "peach" with "1", and prints the result.
<|EOT|>
