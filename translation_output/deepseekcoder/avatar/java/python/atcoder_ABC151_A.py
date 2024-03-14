<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```

### Response:
```python
import sys

def atcoder_ABC151_A():
    s = sys.stdin.readline().strip()
    c = s[0]
    print(chr(ord(c) + 1))

atcoder_ABC151_A()
```

This Python code reads a string from the standard input, gets the first character, converts it to its ASCII value using the `ord` function, increments it by 1, and then converts it back to a character using the `chr` function. The result is printed to the standard output.
<|EOT|>
