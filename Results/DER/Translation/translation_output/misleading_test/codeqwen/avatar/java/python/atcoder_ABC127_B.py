Here is the Python equivalent of the Java code:

```python
def main():
    r, d, x = map(int, input().split())

    for i in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it calculates and prints the next 10 values in the sequence. The `map` function is used to convert the input string into integers. The `input().split()` function is used to split the input string into a list of strings, which are then converted into integers using the `map` function. The `range(10)` function generates a sequence of numbers from 0 to 9, which is used to loop 10 times. In each iteration, the value of `x` is updated by multiplying it by `r` and subtracting `d`, and then it is printed.
