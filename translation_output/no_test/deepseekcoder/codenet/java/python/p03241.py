<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    for i in range(m//n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the given Java code. It reads two integers from the standard input, then it starts a loop from `m/n` down to 1. If `m` is divisible by the current number (`i`), it prints that number and breaks the loop.
<|EOT|>
