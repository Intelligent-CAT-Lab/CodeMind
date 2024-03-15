Here's your Java code translated into Python:

```python
def main():
    n = int(input())
    square = n * n
    odd = []
    even = []

    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    loop = square // n
    div = loop // 2
    # debug(div)

    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even.pop(-1), end=" ")
            else:
                print(even.pop(0), odd.pop(-1), end=" ")
        print()

# Removed the debug function as it is not required in the Python solution.
# In Python, you can use print or logging for debugging purposes.


if __name__ == '__main__':
    main()
```

Note that in the Python version:
- I removed the `Scanner` and `PrintWriter` classes because in Python you can use `input()` and `print()`.
- Instead of `ArrayList`, Python uses lists, which are similar but have different methods.
- In Python, the `pop()` method is used to remove and return an element from the list (`pop(0)` for the beginning and `pop(-1)` or just `pop()` from the end).
- The `println()` method is replaced by simply `print()` with a new line by default.
- Division in Python that should result in an integer uses the floor division operator `//`.
- The `main` method is enclosed in a `main()` function which executes if the script is run directly.
- Since Python doesn't have a built-in debug method like Java's `debug`, you can use `print` statements or logging for debugging purposes.
- I've commented out the debug function, you might need to implement your own if needed.
