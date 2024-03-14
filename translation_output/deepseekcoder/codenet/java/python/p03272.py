<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    print(N-K+1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the difference between them and prints the result.
<|EOT|>
