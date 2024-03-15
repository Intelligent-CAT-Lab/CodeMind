Here's the equivalent code in Python:

```python
def main():
    N = int(input())
    M = int(input())
    ans = 0

    if N > M:
        print(M // 2)
        return

    if N == 1 and M == 1:
        print(0)
        return

    if N == 2 and M == 1:
        print(0)
        return

    if N * 2 > M:
        print(M // 2)
        return

    ans = N + ((M - N * 2) // 4)

    print(ans)

if __name__ == "__main__":
    main()
```

Keep in mind that in Python, the `//` operator is used for integer division, similar to `/` in Java. There's also no need to close the standard input in Python, unlike in Java where good practice is to close the `Scanner`. The for loop that has been commented out in your Java code does not contribute to the function and hence, could be safely omitted in the Python translation.
