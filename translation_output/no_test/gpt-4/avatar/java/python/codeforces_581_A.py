Certainly! Here's the translated code in Python:

```python
if __name__ == "__main__":
    a, b = map(int, input().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1

    ans = a // 2 + b // 2
    print(f"{count} {ans}")
```

In Python, we use `input().split()` to read space-separated input and `map(int, input().split())` to convert it to integers. The `//` operator is used for integer division. Also, note that Python doesn't require semicolons to terminate statements. The whole program is enclosed within an `if __name__ == "__main__":` block, which is a common Python idiom for single-script execution.
