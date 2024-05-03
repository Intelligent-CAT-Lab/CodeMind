Here is the Python equivalent of the Java code:

```python
import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    N = int(sys.stdin.readline())
    
    for x in range(-1000, 1001):
        if (x ** N) * A == B:
            print(x)
            return
    
    print("No solution")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then it iterates over the range from -1000 to 1000. For each integer x, it checks if the result of raising x to the power of N, then multiplying it by A, equals B. If it does, it prints x and returns. If it doesn't find any such x, it prints "No solution".
