Here is the Python equivalent of the Java code:

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

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of complete groups of `K` elements in the array, and then calculates the number of incomplete groups. It then prints the sum of the squares of the number of complete groups and the number of incomplete groups.
