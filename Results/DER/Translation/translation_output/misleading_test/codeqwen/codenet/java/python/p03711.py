Here is the Python equivalent of the Java code:

```python
def grouped(grp, x, y):
    bx = False
    by = False

    for i in range(len(grp)):
        if grp[i] == x:
            bx = True
        if grp[i] == y:
            by = True

    return bx and by

def main():
    x = int(input())
    y = int(input())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    print("Yes" if (grouped(grp1, x, y) or grouped(grp2, x, y)) else "No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It defines a function `grouped` that checks if two numbers are in the same group. The `main` function reads two integers from the user, checks if they are in the same group, and prints "Yes" or "No" accordingly.
