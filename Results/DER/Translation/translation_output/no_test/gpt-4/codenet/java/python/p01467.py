Below is the translation of the given Java code to Python:

```python
def ni(string_value):
    a = [0] * 10
    for i in range(len(string_value)):
        a[i] = int(string_value[-1 - i])
    return a

def main():
    a = ni(input().strip())
    b = ni(input().strip())
    k = int(input().strip())
    max_value = 0

    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue

        borrow = [0] * 11
        c = [0] * 10

        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j + 1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j + 1] = 0 if (i & (1 << j)) > 0 else 1

        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]

        max_value = max(max_value, ans)

    print(max_value)

if __name__ == "__main__":
    main()
```

Note: The Java version makes use of `Scanner` for I/O, whereas in the Python version we use `input().strip()` to read input from stdin and strip any leading or trailing whitespace. The `ni()` function in Java takes a Scanner object and reads the next token, whereas in Python, the input is passed as a string argument directly to the function.
