Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    M = int(input())
    ans = 0

    if N > M:
        print(M//2)
        return

    if N == 1 and M == 1:
        print(0)
        return

    if N == 2 and M == 1:
        print(0)
        return

    if N * 2 > M:
        print(M//2)
        return

    ans = N + ((M - N * 2) // 4)

    print(ans)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the answer, and prints it. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
