Here's the translated Python code for the provided Java program:

```python
def grouped(grp, x, y):
    bx = bx = False
    by = by = False

    for i in grp:
        if i == x:
            bx = True
        if i == y:
            by = True

    return bx and by

def main():
    x, y = map(int, input().split())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    print("Yes" if grouped(grp1, x, y) or grouped(grp2, x, y) else "No")

if __name__ == "__main__":
    main()
```

For the test input `1 3`, you can expect the output to be:

```
Yes
```

The translated Python code simplifies a few aspects of the Java code. For example, in Python, you can directly iterate over the elements of a list, and doing so is more Pythonic than iterating over the indices as in the original Java code. Additionally, the `main` function in Python is not strictly necessary as it is in Java, but this structure is used to mirror the Java code's semantic structure.
