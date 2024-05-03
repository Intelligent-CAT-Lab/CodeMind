Here is the Python equivalent of the Java code:

```python
def main():
    X = int(input())
    Y = int(input())

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads two integers from the user, then enters a loop that doubles the value of `X` until it is greater than `Y`. The number of iterations of the loop is then printed out.
