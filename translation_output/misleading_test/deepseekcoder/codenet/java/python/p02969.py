<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
68

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

def main():
    a = int(sys.stdin.readline())
    print(a*a*3)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any libraries like `java.util.*`. Instead, we use the built-in `sys` module to read input from the standard input (stdin). The `readline()` function reads a line from the input, and `int()` converts that line to an integer. The `print()` function is used to output the result.

The `if __name__ == "__main__":` line is a common idiom in Python. It allows the code to be imported as a module and still run if it's the main program.
<|EOT|>
