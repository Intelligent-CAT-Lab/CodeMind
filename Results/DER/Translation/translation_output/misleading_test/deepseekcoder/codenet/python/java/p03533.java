<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        String S = scanner.next();
        if (Pattern.matches(pattern, S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if it matches the regular expression pattern, and prints "YES" if it does, "NO" if it doesn't.
<|EOT|>
