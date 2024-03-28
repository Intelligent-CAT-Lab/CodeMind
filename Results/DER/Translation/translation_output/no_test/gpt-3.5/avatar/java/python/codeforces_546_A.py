```python
def codeforces_546_A():
    o, g, x = 0, 0, 0
    borrow = 0

    o = int(input())
    n = int(input())
    g = int(input())

    for i in range(1, g + 1):
        x += i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

codeforces_546_A()
```
