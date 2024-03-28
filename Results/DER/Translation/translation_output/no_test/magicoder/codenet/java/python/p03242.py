<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
Here is the equivalent Python code:

```python
import sys

def main():
    S = list(sys.stdin.readline().strip())
    for i in range(3):
        if S[i] == '1':
            S[i] = '9'
        else:
            S[i] = '1'
    print(''.join(S))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, replaces the first three characters with '9' if they are '1' and with '1' if they are '9', and then prints the result.<｜end▁of▁sentence｜>
