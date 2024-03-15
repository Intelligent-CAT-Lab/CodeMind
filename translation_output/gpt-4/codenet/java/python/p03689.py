Below is the converted code from Java to Python:

```python
import sys

def main():
    r, c, h, w = map(int, input().split())

    if r % h == 0 and c % w == 0:
        print("No")
        return

    mcnt = (r // h) * (c // w)
    space = r * c - (r // h * h) * (c // w * w)

    plus_number = ((mcnt + space) // space) + 1
    minus_number = -(plus_number * (h * w - 1) + 1)

    print("Yes")
    for i in range(r):
        for j in range(c):
            num = minus_number if ((i + 1) % h == 0 and (j + 1) % w == 0) else plus_number
            if j >= 1:
                print(' ', end='')
            print(num, end='')
        print()

if __name__ == '__main__':
    main()
```

Note that in Python, we generally don't need classes such as `InputReader` for basic reading from `stdin` because it's much simpler to use the built-in functions (such as `input()` and `print()`).

Also, it's common in Python to include the main part of the script under an `if __name__ == '__main__':` conditional to ensure that it's only executed when the script is run directly, not when it's imported as a module.

Lastly, Python uses indentation to define code blocks instead of curly braces, and the built-in function `print()` handles formatted printing to `stdout`, which is usually sufficient for purposes like this example. The `print()` function by default ends with a newline, and you can replace this with another string using the `end` parameter. To flush the output explicitly, you can use `sys.stdout.flush()` or pass `flush=True` to `print()`, but it's typically not necessary due to Python flushing `stdout` automatically when a newline is printed.
