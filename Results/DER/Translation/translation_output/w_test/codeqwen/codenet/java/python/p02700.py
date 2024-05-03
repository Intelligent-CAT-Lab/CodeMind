Here is the Python version of the Java code:

```python
import sys

def main():
    insn = [int(i) for i in sys.stdin.readline().split()]
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

This Python code does the same thing as the Java code. It reads four integers from the standard input, performs some calculations, and then prints "Yes" or "No" based on the results. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `%` operator is used for modulo division in Python, which is equivalent to `%` in Java. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only called when the script is run directly, not when it is imported as a module.
