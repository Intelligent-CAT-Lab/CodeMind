Here is the Python equivalent of the Java code:

```python
from math import pow

def main():
    A, B, N = map(int, input().split())
    
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            print(x)
            return
    
    print("No solution")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it iterates over all possible values of x from -1000 to 1000. If the value of x raised to the power of N multiplied by A equals B, it prints x and returns. If no such x is found after checking all possibilities, it prints "No solution".
