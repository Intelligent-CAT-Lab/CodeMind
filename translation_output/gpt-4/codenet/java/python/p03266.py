Below is the Python equivalent of the given Java code using the `input()` function to read from standard input:

```python
def main():
    N, K = map(int, input().split())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)

if __name__ == "__main__":
    main()
```

When translating from Java to Python, you'll notice several changes:

1. We don't need to import any classes like `Scanner` because Python has built-in functions to handle input.
2. The syntax for the `main()` method is translated to a `main()` function definition.
3. In Python, integer division is done using `//` instead of `/` as in Java; otherwise, it would result in a float.
4. There is no need to explicitly close the input reader in Python.
5. The `println` method is replaced with the `print()` function.
6. We don't use `long` in Python; it automatically handles large integers.
7. Finally, we check for the script being executed directly to call the `main()` function.
