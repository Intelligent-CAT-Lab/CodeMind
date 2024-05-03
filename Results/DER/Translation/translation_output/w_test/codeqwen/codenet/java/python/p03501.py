Here is the Python equivalent of the Java code:

```python
import sys

MOD = 998244353
#MOD = 1000000007
#INF = 1000000000000000007

def main():
    N = int(sys.stdin.readline())
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    print(min(A*N,B))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the minimum of the product of the first integer and the second integer with the third integer, and prints the result. The `main` function is called when the script is run, and the `if __name__ == "__main__":` statement ensures that the `main` function is only called when the script is run directly (not when it is imported as a module).
