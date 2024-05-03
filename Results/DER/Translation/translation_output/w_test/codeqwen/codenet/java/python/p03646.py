Here is the Python version of the provided Java code:

```python
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

solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the values for the list, and then prints the list in the required format.
