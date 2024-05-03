Here is the Python equivalent of the Java code:

```python
def main():
    a, b, n = map(int, input().split())
    k = 0
    for i in range(1, n // a + 1):
        k += b
    print(k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of times the value `b` should be added to `k` (which is the number of times `a` can be divided into `n`), and then prints the result.
