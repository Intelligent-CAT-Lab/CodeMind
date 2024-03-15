Below is the equivalent Python code for the Java code you've provided:

```python
def search(a, b):
    if a % 1000000 == 0:
        o = 3
    elif a % 10000 == 0:
        o = 2
    elif a % 100 == 0:
        o = 1
    else:
        o = 0
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

When you run this Python script, it will behave as the original Java code, prompting you to enter numbers corresponding to `D` and `N`, and then calculating a final result based on the logic you've provided in the `search` function. Note that in Python, there's no need for a 'Scanner' like in Java, we simply use `input()` function to get the user input, and the long data type in Python 3 is just `int` as Python 3 doesn't distinguish between `int` and `long`.
