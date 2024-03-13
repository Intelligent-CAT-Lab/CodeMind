<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n = int(input())
    m = int(input())
    for i in range(m//n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, then iterates from the quotient of `m` divided by `n` down to 1. If `m` is divisible by the current number, it prints the number and breaks the loop.<｜end▁of▁sentence｜>
