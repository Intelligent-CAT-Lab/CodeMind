Here is the Python equivalent of the Java code:

```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
    print(A, B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, subtracts the third integer from the first if it's less than or equal to the first, subtracts the difference from the second if it's less than or equal to the sum of the first and second, and sets both to zero otherwise. It then prints the resulting values of the first and second integers.
