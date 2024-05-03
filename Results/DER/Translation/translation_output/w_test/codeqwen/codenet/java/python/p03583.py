Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    # a
    for i in range(1, 3510):
        # b
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                return

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then it iterates over two ranges (1 to 3509) to find the values of `i` and `j` that satisfy the conditions in the code. If it finds such values, it prints them and returns. If it doesn't find any, it doesn't print anything and just returns.
