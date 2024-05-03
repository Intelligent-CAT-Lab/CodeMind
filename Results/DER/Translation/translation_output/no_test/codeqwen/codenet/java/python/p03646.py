Here is the Python version of the given Java code:

```python
import sys

def solve():
    K = int(input())
    N = 50
    list_ = [K // N + i for i in range(N)]
    for i in range(K % N):
        list_[i % N] += N + 1
        for j in range(N):
            list_[j] -= 1
    print(N)
    print(' '.join(map(str, list_)))

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads an integer `K` from the standard input, calculates the list `list_` and prints it. The `solve` function is the main function that performs the calculations and prints the result. The `if __name__ == "__main__":` block is used to call the `solve` function when the script is run directly.
