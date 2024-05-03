Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())
    kuti = 1
    tap = 0
    
    while kuti < b:
        kuti = kuti - 1 + a
        tap += 1
    
    print(tap)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of steps needed to reach the value `b` from `1` by repeatedly adding `a` and subtracting `1`, and then prints the number of steps.
