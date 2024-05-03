Here is the Python equivalent of the Java code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    d1 = float(sys.stdin.readline())
    x = float(sys.stdin.readline())

    ans = 0

    for _ in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of a sequence, and prints the result. The `sys.stdin.readline()` function is used to read a line of input from the standard input, and `int()` and `float()` are used to convert the input to integers and floating-point numbers, respectively. The `range(N)` function is used to create a loop that runs N times. The `print(ans)` statement is used to print the result of the calculation.
