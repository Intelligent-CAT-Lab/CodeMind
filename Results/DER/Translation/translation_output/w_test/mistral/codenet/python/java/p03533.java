<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


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
        String pattern = "^A?KIHA?BA?RA?$";
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Matcher matcher = Pattern.compile(pattern).matcher(S);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
