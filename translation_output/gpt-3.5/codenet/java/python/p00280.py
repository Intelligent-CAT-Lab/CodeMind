```python
def slove(x, y, s, a, b):
    if ((x == 5 and y < b and y != 4) or (y == 5 and x < a and x != 4)):
        return
    if (x == a + 1 or y == b + 1):
        return
    if (x == a and y == b):
        print(s)
    for i in range(2):
        if i == 0:
            slove(x + 1, y, s + "A", a, b)
        else:
            slove(x, y + 1, s + "B", a, b)

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    slove(0, 0, "", a, b)
```
