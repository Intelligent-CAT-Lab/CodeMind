Here is the Python equivalent of the Java code:

```python
def main():
    x = sorted(list(map(int, input().split())))
    temp = 2 * x[2] - x[1] - x[0]
    ans = (temp + 1) // 2 if temp % 2 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, sorts them, calculates the difference between the largest and the smallest number, and then calculates the answer based on whether the difference is odd or even. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
