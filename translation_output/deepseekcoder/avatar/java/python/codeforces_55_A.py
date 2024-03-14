<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```

### Response:
```python
import sys

def codeforces_55_A():
    n = int(sys.stdin.readline())
    if n & (n - 1) == 0:
        print("YES")
    else:
        print("NO")

codeforces_55_A()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it is a power of 2, and prints "YES" if it is, "NO" otherwise.
<|EOT|>
