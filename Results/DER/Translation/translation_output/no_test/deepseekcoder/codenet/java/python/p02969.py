<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p02969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a*a*3);
    }
}


```

### Response:
```python
import sys

def p02969():
    a = int(sys.stdin.readline())
    print(a*a*3)

p02969()
```

In Python, we don't need to import a library like `java.util.*`. Instead, we use the `sys` module to read from standard input. The `readline()` function reads a line from standard input. The `int()` function converts the input string to an integer. The `print()` function is used to output the result.
<|EOT|>
