<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
B

Expected output:
A

```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}
```

### Response:
```python
import re

def check_uppercase(s):
    if re.match("^[A-Z]*$", s):
        return "A"
    else:
        return "a"

print(check_uppercase(input()))
```

This Python code does the same thing as the Java code. It checks if the input string is all uppercase letters by using a regular expression. If it is, it returns "A", otherwise it returns "a".
<|EOT|>
