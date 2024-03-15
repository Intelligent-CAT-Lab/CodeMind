Here is the translated code in Python:

```python
def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    E = int(input())
    F = int(input())
    ans1 = A * 100
    ans2 = 0
    for a in range(int(F // (A * 100)) + 1):
        for b in range(int(F // (B * 100)) + 1):
            for c in range(int(F // C) + 1):
                for d in range(int(F // D) + 1):
                    if (100 * a * A + 100 * b * B + C * c + D * d <= F 
                            and (C * c + D * d) / (a * A * 100 + b * B * 100) <= E / 100):
                        if a == 0 and b == 0:
                            continue
                        if (ans2 / ans1) < ((C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d)):
                            ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                            ans2 = C * c + D * d
    print(int(ans1), int(ans2))

if __name__ == "__main__":
    main()
```

In this code snippet:

- The `Scanner` from Java is replaced with Python's `input()` function to read input.
- The data types `int` and `double` are not explicitly declared in Python.
- The `for` loops are written in Python syntax with the `range()` function.
- The division operator `/` automatically returns a float in Python 3, so there's no need to cast it explicitly.
- The `System.out.println` statement is replaced with Python's `print()` function.
- The entry point of the program is checked with `if __name__ == "__main__":` which is a common Python idiom to execute the main function.
