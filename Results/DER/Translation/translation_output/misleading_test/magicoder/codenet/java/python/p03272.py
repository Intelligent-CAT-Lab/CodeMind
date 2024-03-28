<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
102

```
import java.util.*;

public class p03272 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        System.out.println(N-K+1);
    }
}

```

@@ Response
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    print(N - K + 1)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `print(N - K + 1)` statement is used to print the result.<｜end▁of▁sentence｜>
