<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}


```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline())
    print((a - 30) // 2)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline()` to read input from the console. The `//` operator is used for integer division in Python. It's equivalent to the `/` operator in Java but it always returns an integer.
<|EOT|>
