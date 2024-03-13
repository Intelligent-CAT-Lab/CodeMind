<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```

@@ Response
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        Matcher matcher = pattern.matcher(S);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It uses the `java.util.regex.Pattern` and `java.util.regex.Matcher` classes to compile and match the regular expression pattern. The `java.util.Scanner` class is used to read the input string from the user.<｜end▁of▁sentence｜>
