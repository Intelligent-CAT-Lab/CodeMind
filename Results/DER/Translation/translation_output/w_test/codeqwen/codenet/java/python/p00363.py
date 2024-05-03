Here is the Python equivalent of the Java code:

```python
def main():
    W, H, c = map(int, input().split())
    x, y = (W - 1) // 2, (H - 1) // 2

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

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the user, calculates the center of the box, and then prints out the box character by character. The `end=""` argument in the `print` function is used to prevent a newline character from being printed after each character.
