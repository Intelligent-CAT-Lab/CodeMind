Here's the Java code translated into Python:

```python
import sys

def main():
    # Reading input as integer values
    N, M, K = map(int, sys.stdin.readline().split())

    # Iterating through the possible values
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

Note that in Python, you can typically use `input()` for reading from `stdin`. However, considering that the provided Java code uses `BufferedInputStream`, the Python translation here uses `sys.stdin.readline()` for potentially better performance in handling large inputs.
