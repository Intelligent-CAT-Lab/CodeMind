<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    if ((n + 1) // 2 >= m):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the half of the first integer plus one is greater than or equal to the second integer, and prints "YES" if it is, and "NO" otherwise.<｜end▁of▁sentence｜>
