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

This Python code reads the input from the standard input (stdin), performs the same operations as the Java code, and prints the result. The `main()` function is defined to encapsulate the logic of the program. The `if __name__ == "__main__":` block ensures that the `main()` function is called when the script is run directly.
