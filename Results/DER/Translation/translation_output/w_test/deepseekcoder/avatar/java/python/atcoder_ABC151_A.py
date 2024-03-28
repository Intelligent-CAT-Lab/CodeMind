<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
d


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

def main():
    c = sys.stdin.readline().strip()
    print(chr(ord(c) + 1))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` to read the input. The `ord()` function is used to get the ASCII value of the character, and then we add 1 to it using `chr()` to get the next character.
<|EOT|>
