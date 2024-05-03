Here is the Python equivalent of the Java code:

```python
import sys

def main():
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    
    if x1 == x2:
        dif = abs(y1 - y2)
        print(x1 + dif, y1, x1 + dif, y2)
    elif y1 == y2:
        dif = abs(x1 - x2)
        print(x1, y1 + dif, x2, y2 + dif)
    elif abs(x1 - x2) == abs(y1 - y2):
        print(x1, y2, x2, y1)
    else:
        print(-1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then prints the output based on the conditions specified in the Java code. The `main` function is the entry point of the program, and it calls the `main` function when the program is run.
