<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
119

Expected output:
978

```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1') ? '9' : '1';
    System.out.println(S);
  }
}
```

@@ Response
```python
import sys

def main():
    S = sys.stdin.readline().strip()
    S = S.replace('1', 'x')
    S = S.replace('9', '1')
    S = S.replace('x', '9')
    print(S)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input from the user. We then replace all '1's with 'x', '9's with '1', and 'x's with '9'. This effectively swaps the first three digits of the input. The `strip()` function is used to remove any leading or trailing whitespace from the input.<｜end▁of▁sentence｜>
