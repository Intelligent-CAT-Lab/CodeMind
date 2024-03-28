Here is the translated code from Java to Python:

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
        elif (j != 0 and j != W - 1 and (i == 0 or i == H - 1)):
            print("-", end="")
        elif (i != 0 and i != H - 1 and (j == 0 or j == W - 1)):
            print("|", end="")
        elif j == x and i == y:
            print(c, end="")
        else:
            print(".", end="")
    print()
```

This Python code will produce the same output as the provided Java code when given the same inputs for width (W), height (H), and character (c). The code uses Python's `print` function with `end=""` to avoid adding a newline after each character, mimicking the behavior of `System.out.print` in Java.
