Below is the translated Java code into Python:

```python
def calc(num):
    n = float(num)
    sum_digits = 0
    while num != 0:
        sum_digits += num % 10
        num //= 10
    return n / sum_digits

def main():
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```

In this translation:

- `Scanner in = new Scanner(System.in)` has been replaced with `input()` to get user input from the console.
- The data types `int` and `long` in Java have been handled with a single `int` type in Python since Python's `int` automatically handles long integers without any additional syntax.
- Division operator `/` has been replaced with `//` for integer division.
- `System.out.println` has been replaced with `print()`.
- The `calc` function and `main` function replace the static `calc` method and the `main` method in Java. In Python, functions are not declared as static or public and can be called directly.
- I declared a `main()` function and check if `__name__ == "__main__"` to imitate the typical behavior of the `main` method in Java.
- Note that the `import` statements from Java are not needed as we're not using any explicit library to handle input or arithmetic in Python.
