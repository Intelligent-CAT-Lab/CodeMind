<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
78

```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```

@@ Response
```python
import re

def solve(s):
    while '0B ' in s or '1B ' in s:
        s = re.sub('0B ', '', s)
        s = re.sub('1B ', '', s)
    s = re.sub(' B ', '', s)
    return s

s = input()
print(solve(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, and then repeatedly replaces all occurrences of '0B ' and '1B ' with nothing, and all occurrences of ' B ' with nothing. The result is then printed to the console.<｜end▁of▁sentence｜>
