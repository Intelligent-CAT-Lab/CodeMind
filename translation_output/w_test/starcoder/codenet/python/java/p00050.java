<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


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
            input = input.replace(m.group(), m.group().equals("apple")? "peach" : "apple");
        }
        System.out.println(input);
    }
}
```

'''
<|endoftext|>
