Here is the Python equivalent of the Java code:

```python
def main():
    n, l = map(int, input().split())
    diff = [abs(l+i-1) for i in range(1, n+1)]
    remove_k = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)//2 - n - (l+ remove_k -1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the absolute difference between the sum of the first `n` natural numbers and the `l`th number, and then prints the result.
