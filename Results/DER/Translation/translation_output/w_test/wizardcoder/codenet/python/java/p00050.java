Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


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
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] words = {"apple", "peach"};
        String[] replacements = {"peach", "apple"};

        String output = input;
        for (int i = 0; i < words.length; i++) {
            output = output.replaceAll(words[i], replacements[i]);
        }

        System.out.println(output);
    }
}
```<|endoftext|>
