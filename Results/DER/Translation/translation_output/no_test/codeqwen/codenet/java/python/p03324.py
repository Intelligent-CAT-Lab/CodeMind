Here is the Python equivalent of your Java code:

```python
def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return b == o

def main():
    D = int(input())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    N = int(input())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as your Java code. It reads two inputs, `D` and `N`, and then calculates `A` based on `D`. It then enters a loop that continues until `ser` is equal to `N`. In each iteration of the loop, it increments `count` and checks if `search(count * A, D)` is true. If it is, it increments `ser`. Finally, it prints the value of `count * A`.
