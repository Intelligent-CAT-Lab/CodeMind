<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import re
pattern = r"^A?KIHA?BA?RA?$"
S = input()
if re.match(pattern,S):
    print("YES")
else:
    print("NO")
```

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        if (pattern.matcher(S).matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
<|endoftext|>
