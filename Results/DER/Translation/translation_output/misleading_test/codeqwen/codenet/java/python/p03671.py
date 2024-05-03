Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    sum = sorted([a, b, c])
    print(sum[0] + sum[1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, sorts them in ascending order, and then prints the sum of the first two integers. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
