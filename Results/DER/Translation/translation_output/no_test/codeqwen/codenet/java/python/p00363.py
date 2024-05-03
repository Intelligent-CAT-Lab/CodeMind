Here is the Python equivalent of the Java code:

```python
W = int(input())
H = int(input())
c = input()
x = (W - 1) // 2
y = (H - 1) // 2

for i in range(H):
    for j in range(W):
        if (j == 0 and i == 0) or (j == 0 and i == H - 1) or (j == W - 1 and i == 0) or (j == W - 1 and i == H - 1):
            print("+", end="")
        elif (j != 0 and j != W - 1 and i == 0) or (j != 0 and j != W - 1 and i == H - 1):
            print("-", end="")
        elif (i != 0 and i != H - 1 and j == 0) or (i != 0 and i != H - 1 and j == W - 1):
            print("|", end="")
        elif (j == x and i == y):
            print(c, end="")
        else:
            print(".", end="")
    print()
```

This Python code does the same thing as the Java code: it reads three integers from the user, and then prints a rectangle of characters based on these integers. The `end=""` argument in the `print()` function is used to prevent a newline character from being printed after each character, which would cause the output to be displayed in a single line.
