<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


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

### Response:
```python
import re

def remove_substrings(s):
    while '0B ' in s or '1B ' in s:
        s = re.sub('0B |1B ', '', s)
    s = re.sub(' B ', '', s)
    return s

s = input()
print(remove_substrings(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, removes all occurrences of '0B ' and '1B ' in the string, and then removes all occurrences of ' B ' from the string. The result is printed to the output.
<|EOT|>
