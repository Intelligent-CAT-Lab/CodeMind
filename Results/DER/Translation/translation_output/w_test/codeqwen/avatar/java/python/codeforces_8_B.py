Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    x, y, k = 0, 0, 0
    co = [[0] * 101 for _ in range(2)]
    co[0][k] = x
    co[1][k] = y
    k += 1

    for ch in s:
        if ch == 'L':
            x -= 1
        elif ch == 'R':
            x += 1
        elif ch == 'U':
            y += 1
        elif ch == 'D':
            y -= 1
        co[0][k] = x
        co[1][k] = y
        k += 1

    flag = True
    for i in range(k - 3):
        for j in range(i + 3, k):
            dx = abs(co[0][i] - co[0][j])
            dy = abs(co[1][i] - co[1][j])
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break
        if not flag:
            break

    if flag:
        print("OK")
    else:
        print("BUG")


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. Depending on the character, it updates the x and y coordinates. It then stores the coordinates in a 2D list. After that, it checks if there are any three consecutive coordinates that are either horizontally or vertically adjacent. If it finds such a set of coordinates, it sets the flag to False and breaks out of the loop. Finally, it prints "OK" if the flag is True, otherwise it prints "BUG".
