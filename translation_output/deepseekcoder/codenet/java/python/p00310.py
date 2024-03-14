<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```

### Response:
```python
import sys

def main():
    p, m, c = map(int, sys.stdin.readline().split())
    print(p + m + c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, adds them together, and then prints the result. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline().split()` function reads a line from the standard input and splits it into a list of strings. The `__name__ == "__main__"` part is a common idiom in Python scripts to allow them to be both imported as modules and run as standalone scripts.
<|EOT|>
