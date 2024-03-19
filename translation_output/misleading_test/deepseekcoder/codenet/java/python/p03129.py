<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
kg-

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
    a, b = map(int, sys.stdin.readline().split())
    if (a + 1) // 2 >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In Python, the `//` operator is used for integer division, which discards the fractional part and only returns the integer part of the division. This is equivalent to the `/` operator in Java but it always rounds down to the nearest integer.

The `if __name__ == "__main__":` line is used to call the main function when the script is run directly. This is a common pattern in Python scripts.
<|EOT|>
