<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    if((n + 1) // 2 >= m):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In Python, the `//` operator is used for integer division, which discards the fractional part and only returns the integer part of the division. This is equivalent to the `/` operator in Java but it always rounds down to the nearest integer.
<|EOT|>
