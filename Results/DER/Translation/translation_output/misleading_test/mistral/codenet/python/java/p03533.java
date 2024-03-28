<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YE

```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```
[/INST]
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "KIHBR";
        String pattern = "^A?KIHA?BA?RA?$";
        Matcher matcher = Pattern.compile(pattern).matcher(input);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
