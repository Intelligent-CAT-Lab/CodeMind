<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    c = s[0]
    print(chr(ord(c) + 1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, gets the first character, and prints the next character in the ASCII table. The `ord()` function in Python returns an integer representing the Unicode character, and `chr()` function returns a string representing a character whose Unicode code point is the integer.<｜end▁of▁sentence｜>
