Here is the equivalent Python code for the provided Java code snippet:

```python
W, H, c = input().split()
W = int(W)
H = int(H)
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
        elif j == x and i == y:
            print(c, end="")
        else:
            print(".", end="")
    print()
```

And here's how you can use it with the provided test case:

```python
# Input the values as per the test case provided
W, H, c = input().split()
W = int(W)
H = int(H)
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
        elif j == x and i == y:
            print(c, end="")
        else:
            print(".", end="")
    print()
```

Running this with the input `3 3 B` should print:

```
+-+
|B|
+-+
```
