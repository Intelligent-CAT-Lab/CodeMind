<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```

### Response:
```python
import re

def solve(s):
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.fullmatch(pat, s):
        return "YES"
    else:
        return "NO"

print(solve(input()))
```

This Python code does the same thing as the Java code. It uses the `re` module to compile the regular expression pattern and match it against the input string. If the input string matches the pattern, it returns "YES", otherwise it returns "NO".
<|EOT|>
