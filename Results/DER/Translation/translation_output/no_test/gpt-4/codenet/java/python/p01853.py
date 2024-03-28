Below is the equivalent Python code, taking into account that Python does not have a built-in fast scanner like Java does, so we're using the built-in `input()` function for simplicity. Note that `input()` is slower than a specialized fast scanner and for competitive programming, you may need to implement fast I/O techniques in Python. Additionally, the detailed implementations of printing integers and iterating in Python differs from Java:

```python
def main():
    n, m = map(int, input().split())

    if n % 2 == 0:
        half_n = n // 2
        print(0, end='')
        for _ in range(1, half_n):
            print(' 0', end='')
        for _ in range(half_n + 1, n):
            print(f' {m}', end='')
    else:
        half_n = n // 2
        print(0, end='')
        for _ in range(1, half_n):
            print(' 0', end='')
        for _ in range(half_n + 1, n):
            print(f' {m}', end='')

    print()

if __name__ == "__main__":
    main()
```

Keep in mind the `print()` function in Python can be replaced with `sys.stdout.write()` for a slight performance increase, though it is rarely necessary for most applications other than competitive programming.
