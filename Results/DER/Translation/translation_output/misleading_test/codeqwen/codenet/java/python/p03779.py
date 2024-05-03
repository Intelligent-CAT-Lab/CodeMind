Here is the Python equivalent of the Java code:

```python
def main():
    x = int(input())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, calculates the largest integer `i` such that `i * (i + 1) / 2` is less than or equal to the input, and prints that integer.
