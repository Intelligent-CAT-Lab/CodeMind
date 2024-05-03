Here is the Python version of the Java code:

```python
import sys

def get_input():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    insn = get_input()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c//b
    tt = c%b
    y = a//d
    u = a%d
    while(a >=0 or c>=0):
        c = c - b
        if (c <=0):
            print("Yes")
            return
        a = a - d
        if (a<=0):
            print("No")
            return

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, performs some calculations, and then prints "Yes" or "No" based on the results. The `get_input` function reads a line of input and splits it into a list of integers. The `main` function uses this list to perform the calculations.
