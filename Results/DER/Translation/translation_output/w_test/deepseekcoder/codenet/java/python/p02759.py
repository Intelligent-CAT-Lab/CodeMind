<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
3


```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```

### Response:
```python
import sys

def main():
    N = int(sys.stdin.readline())
    print((N + 1) // 2)

if __name__ == "__main__":
    main()
```

In Python, we don't need to close the scanner or return from the main function. The ```//``` operator is used for integer division in Python.
<|EOT|>
