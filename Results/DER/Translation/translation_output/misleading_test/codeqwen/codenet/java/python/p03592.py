Here is the Python version of the Java code:

```python
import sys

def main():
    N, M, K = map(int, sys.stdin.readline().split())

    for i in range(N + 1):
        for j in range(M + 1):
            sum = M * i + N * j - (i * j * 2)
            if sum == K:
                print("Yes")
                return

    print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then iterates over all possible pairs of integers (i, j) such that 0 <= i <= N and 0 <= j <= M. For each pair, it calculates the sum of M * i + N * j - (i * j * 2) and checks if it is equal to K. If it is, it prints "Yes" and returns. If it finishes checking all pairs without finding a match, it prints "No".
