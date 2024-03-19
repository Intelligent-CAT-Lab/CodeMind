<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 14

Expected output:
-21

```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

### Response:
Here is the Python version of the given Java code:

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m // n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, then it starts from `m // n` and goes down to 1, checking if `m` is divisible by the current number. If it is, it prints the number and stops.
<|EOT|>
