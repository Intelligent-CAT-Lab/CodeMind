<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
YES


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
    if ((a + 1) // 2) >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the ```sys.stdin.readline().split()``` method to read the input from the console. The ```map(int, ...)``` function is used to convert the input strings to integers. The ```//``` operator is used for integer division in Python.
<|EOT|>
