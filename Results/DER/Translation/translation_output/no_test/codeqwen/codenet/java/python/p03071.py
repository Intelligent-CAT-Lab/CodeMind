Here is the Python equivalent of your Java code:

```python
def main():
    A = int(input())
    B = int(input())
    c = 0

    for i in range(2):
        if A >= B:
            c += A
            A -= 1
        else:
            c += B
            B -= 1

    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as your Java code. It reads two integers from the user, then performs the same operations as your Java code. The result is then printed to the console.
