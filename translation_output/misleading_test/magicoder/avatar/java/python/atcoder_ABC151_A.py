<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
O

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
```python
import sys

def main():
    c = sys.stdin.readline().strip()
    print(chr(ord(c) + 1))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input from the user. This function reads a line from the standard input (which is typically the keyboard), removes any leading or trailing whitespace, and returns the resulting string.

Then, we use the `ord()` function to get the ASCII value of the character, increment it by 1, and finally use the `chr()` function to convert the ASCII value back to a character.

The `if __name__ == "__main__":` block is a common idiom in Python to ensure that the `main()` function is only called when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
